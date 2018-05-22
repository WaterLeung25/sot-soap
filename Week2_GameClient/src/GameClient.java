import soap.rank.GameRankService;
import soap.rank.Rank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GameClient {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton registerButton;
    private JButton winButton;
    private JButton loseButton;
    private JList list1;
    private JButton showRankButton;

    GameRankService gameRankService = new GameRankService();
    Rank rank = gameRankService.getGameRankPort();

    private String username = "";
    private int score = 0;

    public GameClient() {
        winButton.setEnabled(false);
        loseButton.setEnabled(false);
        showRankButton.setEnabled(false);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = textField1.getText();
                String password = passwordField1.getText();
                String m = rank.getNewUser(username,password,score);
                if (!m.equals("The username already exist")){
                    winButton.setEnabled(true);
                    loseButton.setEnabled(true);
                    showRankButton.setEnabled(true);
                    registerButton.setEnabled(false);
                }
                JOptionPane.showMessageDialog(null, m);
            }
        });

        winButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score = rank.updateWinArchive(username, score);
                JOptionPane.showMessageDialog(null, "Your score is " + score);
            }
        });

        loseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score = rank.updateLoseArchive(username, score);
                JOptionPane.showMessageDialog(null, "Your score is " + score);
            }
        });

        showRankButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel dlw = new DefaultListModel();
                List<String> rk = new ArrayList<>();
                for (String s : rank.createRank()){
                    rk.add(s);
                }
                for (String s : rk){
                    dlw.addElement(s);
                }
                list1.setModel(dlw);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("GameClient");
        frame.setContentPane(new GameClient().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
