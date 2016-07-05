/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

/**
 *
 * @author Hlch1
 */
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;

public class DisplayQueryResults extends JFrame
{
    // database URL, username and password

    private static final String DATABASE_URL = "jdbc:derby:c:\\Users\\Hlch1\\Documents\\examples\\ch21\\books_examples\\books";
    private static final String USERNAME = "deitel";
    private static final String PASSWORD = "deitel";

    // default query retrieves all data from Authors table
    private static final String DEFAULT_QUERY = "SELECT * FROM Authors";

    private static ResultSetTableModel tableModel;

    public DisplayQueryResults()
    {
        // create ResultSetTableModel and display database table
        try
        {
            // create TableModel for results of query SELECT * FROM Authors 
            tableModel = new ResultSetTableModel(DATABASE_URL,
                    USERNAME, PASSWORD, DEFAULT_QUERY);

            // set up JTextArea in which user types queries
            final JTextArea queryArea = new JTextArea(DEFAULT_QUERY, 3, 100);
            queryArea.setWrapStyleWord(true);
            queryArea.setLineWrap(true);

            JScrollPane scrollPane = new JScrollPane(queryArea,
                    ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            // set up JButton for submitting queries
            JButton submitButton = new JButton("Submit Query");

            // create Box to manage placement of queryArea and
            // submitButton in GUI
            Box boxNorth = Box.createHorizontalBox();
            boxNorth.add(scrollPane);
            boxNorth.add(submitButton);

            // create JTable based on the tableModel 
            JTable resultTable = new JTable(tableModel);

            JLabel filterLabel = new JLabel("Filter:");
            final JTextField filterText = new JTextField();
            JButton filterButton = new JButton("Apply Filter");
            Box boxSouth = Box.createHorizontalBox();

            boxSouth.add(filterLabel);
            boxSouth.add(filterText);
            boxSouth.add(filterButton);

            // place GUI components on JFrame's content pane
            JFrame window = new JFrame("Displaying Query Results");
            add(boxNorth, BorderLayout.NORTH);
            add(new JScrollPane(resultTable), BorderLayout.CENTER);
            add(boxSouth, BorderLayout.SOUTH);

            // create event listener for submitButton
            submitButton.addActionListener(
                    new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    // perform a new query
                    try
                    {
                        tableModel.setQuery(queryArea.getText());
                    } catch (SQLException sqlException)
                    {
                        JOptionPane.showMessageDialog(null,
                                sqlException.getMessage(), "Database error",
                                JOptionPane.ERROR_MESSAGE);

                        // try to recover from invalid user query
                        // by executing default query
                        try
                        {
                            tableModel.setQuery(DEFAULT_QUERY);
                            queryArea.setText(DEFAULT_QUERY);
                        } catch (SQLException sqlException2)
                        {
                            JOptionPane.showMessageDialog(null,
                                    sqlException2.getMessage(), "Database error",
                                    JOptionPane.ERROR_MESSAGE);

                            // ensure database connection is closed 
                            tableModel.disconnectFromDatabase();

                            System.exit(1); // terminate application
                        }
                    }
                }
            }
            );

            final TableRowSorter<TableModel> sorter
                    = new TableRowSorter<TableModel>(tableModel);
            resultTable.setRowSorter(sorter);

            // create listener for filterButton
            filterButton.addActionListener(
                    new ActionListener()
            {
                // pass filter text to listener
                public void actionPerformed(ActionEvent e)
                {
                    String text = filterText.getText();

                    if (text.length() == 0)
                    {
                        sorter.setRowFilter(null);
                    } else
                    {
                        try
                        {
                            sorter.setRowFilter(
                                    RowFilter.regexFilter(text));
                        } catch (PatternSyntaxException pse)
                        {
                            JOptionPane.showMessageDialog(null,
                                    "Bad regex pattern", "Bad regex pattern",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
            );
            // dispose of window when user quits application (this overrides
            // the default of HIDE_ON_CLOSE)
            window.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            window.setSize(550, 280);
            window.setVisible(true);

            // ensure database is closed when user quits application
            addWindowListener(
                    new WindowAdapter()
            {
                // disconnect from database and exit when window has closed 
                public void windowClosed(WindowEvent event)
                {
                    tableModel.disconnectFromDatabase();
                    System.exit(0);
                }
            }
            );
        } catch (SQLException sqlException)
        {
            JOptionPane.showMessageDialog(null, sqlException.getMessage(),
                    "Database error", JOptionPane.ERROR_MESSAGE);
            tableModel.disconnectFromDatabase();
            System.exit(1); // terminate application
        }
    }
}
