import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by DT11ST on 8/30/2018.
 */
public class OXFORM {
    private JPanel MainPanel;
    private JLabel lblScoreX;
    private JLabel lblScoreDraw;
    private JLabel lblScoreO;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private OX ox = new OX();
    private int col;
    private  int row;
    private void process(){
        if(ox.CheckWin()){
          int resual =  JOptionPane.showConfirmDialog(null,ox.GetPlayerCurrent()+" WIN ,"+"Do you want to play again?","WIN",JOptionPane.YES_NO_OPTION);
          if(resual == JOptionPane.YES_OPTION){
              ox.ResetTable();
              render();
          }
        }else if(ox.CheckDraw()){
            int resual =  JOptionPane.showConfirmDialog(null," Draw ,"+"Do you want to play again?","Draw",JOptionPane.YES_NO_OPTION);
            if(resual == JOptionPane.YES_OPTION){
                ox.ResetTable();
                render();
            }
        }
    }
    public OXFORM() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 0;
                row = 0;
               if(ox.put(row,col)){
                  render();

                  process();
                  ox.SwitchPlayer();
              }




            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 0;
                row = 1;
                if(ox.put(row,col)){
                    render();
                    process();
                    ox.SwitchPlayer();
                }else {

                }


            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 0;
                row = 2;
                if(ox.put(row,col)){
                    render();
                    process();
                    ox.SwitchPlayer();
                }else {

                }


            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 1;
                row = 0;
                if(ox.put(row,col)){
                    render();

                    process();
                    ox.SwitchPlayer();
                }else {

                }


            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 1;
                row = 1;
                if(ox.put(row,col)){
                    render();

                    process();
                    ox.SwitchPlayer();
                }else {

                }


            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 1;
                row = 2;
                if(ox.put(row,col)){
                    render();

                    process();
                    ox.SwitchPlayer();
                }else {

                }


            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 2;
                row = 0;
                if(ox.put(row,col)){
                    render();

                    process();
                    ox.SwitchPlayer();
                }else {

                }


            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 2;
                row = 1;
                if(ox.put(row,col)){
                    render();

                    process();
                    ox.SwitchPlayer();
                }else {

                }


            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = 2;
                row = 2;
                if(ox.put(row,col)){
                    render();

                    process();
                    ox.SwitchPlayer();
                }else {

                }


            }
        });

    }

    private void render() {
        button1.setText(ox.get(0,0));
        button2.setText(ox.get(1,0));
        button3.setText(ox.get(2,0));
        button4.setText(ox.get(0,1));
        button5.setText(ox.get(1,1));
        button6.setText(ox.get(2,1));
        button7.setText(ox.get(0,2));
        button8.setText(ox.get(1,2));
        button9.setText(ox.get(2,2));
        lblScoreX.setText("X : "+ox.getCountx());
        lblScoreO.setText("O : "+ox.getCounto());
        lblScoreDraw.setText("Draw : "+ox.getCountDraw());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        OXFORM form = new OXFORM();
        frame.setContentPane(form.MainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,500));
        frame.setVisible(1==1);


    }

}
