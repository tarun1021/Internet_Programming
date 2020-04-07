import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.text.DecimalFormat;
public class Test6 extends JFrame
{
  static JLabel title = new JLabel("Average of Grades");
 static JTextPane textPane = new JTextPane();
static int numberOfGrades = 0;
 static int total = 0;
 static DecimalFormat twoDigits = new DecimalFormat ("##0.00");
 static int[] grades = new int[50];
public Container createContentPane()
 {
 JPanel northPanel = new JPanel();
 northPanel.setLayout(new FlowLayout());
northPanel.add(title);
 JPanel centerPanel = new JPanel();
 textPane = addTextToPane();
 JScrollPane scrollPane = new JScrollPane(textPane);
 scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
scrollPane.setPreferredSize(new Dimension(500,200));
 centerPanel.add(scrollPane)
Container c = getContentPane();
 c.setLayout(new BorderLayout(10,10));
 c.add(northPanel,BorderLayout.NORTH);
 c.add(centerPanel,BorderLayout.CENTER);
 return c;
 }
 public static JTextPane addTextToPane()
{
 Document doc = textPane.getDocument();
 try
 {
 // clear previous text
 doc.remove(0,doc.getLength());
 //insert title
 doc.insertString(0,"Grades\n",textPane.getStyle("large"));
 //insert grades and calculate average
 for(int j=0; j<grades.length; j++)
 {
 doc.insertString(doc.getLength(), grades[j] + "\n", textPane.getStyle("large"));
 }
 }
 catch(BadLocationException ble)
 {
 System.err.println("Couldn't insert text");
 }
 return textPane;
}
//method to sort array
 public void grades(int grdArray[])
 {
 //sort int array
 for (int pass = 1; pass<grdArray.length; pass++)
 {
 for (int element = 0; element<grdArray.length -1; element++)
 {
 swap(grades, element, element + 1);
 }
 }
 addTextToPane();

 }
 //method to swap elements of array
 public void swap(int swapArray[], int first, int second)
 {
 int hold;
 hold = swapArray[first];
 swapArray[first] = swapArray[second];
 swapArray[second] = hold;
 }
 public static void main(String args[])
 {
 JFrame.setDefaultLookAndFeelDecorated(true);
 Test6 f = new Test6();
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 int integerInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a grade 
(0-100) or -1 to calculate the average"));
 int count = 0;
 int[] grades = new int[50];
 int num = 0;
while (count<50 && num!= -1)
 {
 num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a grade 
(0-100) or -1 to calculate the average" + (count+1)));
 if(num!=-1)
 grades[count] = num;
 count++;
 }
 f.setContentPane(f.createContentPane());
 f.setSize(500,500);
f.setVisible(true);
 }
}