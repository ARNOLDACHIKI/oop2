import javax.swing.*;

public class Menu  extends JFrame {
    private JMenuBar  bar=new JMenuBar();
    private JMenu menuFile,menuEdit,menuHelp,menuExternally;
    private JMenuItem menuItemNew,menuItemOpen,menuItemShare,menuItemInternally,menuItemInternet,menuItemChatgpt;
    public Menu(){
        super("Menu Demo");
        
        menuFile=new JMenu("File");
        menuEdit=new JMenu("Edit");
        menuHelp=new JMenu("Help");
        menuExternally=new JMenu("External");
        menuItemNew=new JMenuItem("New");
        menuItemOpen=new JMenuItem("Open");
        Handler handle=new Handler();
        menuItemOpen.addActionListener(handle);
        menuItemShare=new JMenuItem("Share");
        menuItemInternally=new JMenuItem("Internally");
        menuItemInternet=new JMenuItem("Internet");
        menuItemChatgpt=new JMenuItem("Chatgpt");
        setJMenuBar(bar);
        bar.add(menuFile);
        bar.add(menuEdit);
        bar.add(menuHelp);
        menuFile.add(menuItemNew);
        menuFile.add(menuItemOpen);
        menuFile.add(menuItemShare);
        menuHelp.add(menuItemInternally);
        menuHelp.add(menuExternally);
        menuExternally.add(menuItemInternet);
        menuExternally.add(menuItemChatgpt);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
    }
    private class Handler implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e){
            
            if(e.getSource()==menuItemOpen){
                JOptionPane.showMessageDialog(null,"There is No file to open");
            }
           
        }
    }

    public  static void main(String []  S){
        new Menu();

    }
}
