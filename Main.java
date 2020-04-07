import java.awt.*;  
import java.awt.event.*;  
class Main{  
	public static void main(String[] args) {  
	    Frame f=new Frame("Color Changer"); 
        Button change=new Button("Change Color"); 
        Choice choice=new Choice();  
        choice.setBounds(60,50,150,30); 
        change.setBounds(60,80,150,30);
    
        choice.setBackground(Color.LIGHT_GRAY); 
        change.setBackground(Color.LIGHT_GRAY); 
        
        choice.add("Red");  
        choice.add("Green");  
        choice.add("Blue");  
        choice.add("Yellow");  
        choice.add("Pink");
        change.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) { 
                int index = choice.getSelectedIndex();
                switch(index){
                    case 0:
                        f.setBackground(Color.RED);
                        break;
                    case 1:
                        f.setBackground(Color.GREEN);
                        break;
                    case 2:
                        f.setBackground(Color.BLUE);
                        break;
                    case 3:
                        f.setBackground(Color.YELLOW);
                        break;
                    case 4:
                        f.setBackground(Color.PINK);
                        break; 
                }      
            }  
        });
        
        f.add(choice);
        f.add(change); 
	    f.setSize(270,270);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	     
	   
	    
	}  
}  
