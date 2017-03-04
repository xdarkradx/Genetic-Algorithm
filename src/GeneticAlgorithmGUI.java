import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Team 1..
 */
public class GeneticAlgorithmGUI extends JApplet {
	int level = 1;
	int mutates = 0;
	Population pop = new Population("111111", 16);
	
	 
	public boolean CheckForVictory(){
		
		for(Member m : pop.population){
			if (m.bitString.equals(pop.target.bitString))
				return true;
		}
		return false;		
	}
	
	public void checkForVictoryMutate(){
		for(Member m : pop.population){
			if (m.bitString.equals(pop.target.bitString))
				levelComplete("Wow.. the odds were against you, but you did it.", "Mutant Victory!");
		}
		if (mutates > 12){
			levelComplete("Mutation by it's self.. not a good way to solve this.", "Just go on to level 3");
		}
	}
	public void levelThree(){
		jSinglePointCrossoverButton1.setVisible(true);
		jMultiPointCrossoverButton.setVisible(true);
		mutates = -100;
	}
	 public static void levelComplete(String infoMessage, String titleBar){
	        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
	    }
	
	//public void LevelOne() {
	 public void init() {  
        jLevelValue.setText(Integer.toString(level));
        jTargetBitStringValue.setText(pop.target.bitString);
        jMutateButton1.setVisible(false);
        jMutateButton2.setVisible(false);
        jMutateButton3.setVisible(false);
        jMutateButton4.setVisible(false);
        jMutateButton5.setVisible(false);
        jMutateButton6.setVisible(false);
        jMutateButton7.setVisible(false);
        jMutateButton8.setVisible(false);
        jMutateButton9.setVisible(false);
        jMutateButton10.setVisible(false);
        jMutateButton11.setVisible(false);
        jMutateButton12.setVisible(false);
        jMutateButton13.setVisible(false);
        jMutateButton14.setVisible(false);
        jMutateButton15.setVisible(false);
        jMutateButton16.setVisible(false);
        jFitnessLabel.setVisible(false);
        jFitnessLabel1.setVisible(false);
        jFitnessValueLabel1.setVisible(false);
        jFitnessValueLabel2.setVisible(false);
        jFitnessValueLabel3.setVisible(false);
        jFitnessValueLabel4.setVisible(false);
        jFitnessValueLabel5.setVisible(false);
        jFitnessValueLabel6.setVisible(false);
        jFitnessValueLabel7.setVisible(false);
        jFitnessValueLabel8.setVisible(false);
        jFitnessValueLabel9.setVisible(false);
        jFitnessValueLabel10.setVisible(false);
        jFitnessValueLabel11.setVisible(false);
        jFitnessValueLabel12.setVisible(false);
        jFitnessValueLabel13.setVisible(false);
        jFitnessValueLabel14.setVisible(false);
        jFitnessValueLabel15.setVisible(false);
        jFitnessValueLabel16.setVisible(false);
        jMultiPointCrossoverButton.setVisible(false);
        jNextGenButton.setVisible(false);
        jRandomGeneration.setVisible(false);
        jGenerationLabel.setVisible(false);
        jGenerationValueLabel.setVisible(false);
        updateBitStrings(pop);
        jTextArea.setText("Single-Point Crossover Description\n\n" + "Two members of population chosen as\nparents\n"
        		+ "\n" + "Cut the two parents at the cross-site"
        		+ "\n" + "Child 1 formed with left portion of \nparent 1and right portion of parent 2."
        		+ "\n\n\n" + "Child 2 formed similarly");
	}

	public void updateBitStrings(Population pop) {
		jBitStringLabel1.setText(pop.population.get(0).bitString);
        jBitStringLabel2.setText(pop.population.get(1).bitString);
        jBitStringLabel3.setText(pop.population.get(2).bitString);
        jBitStringLabel4.setText(pop.population.get(3).bitString);
        jBitStringLabel5.setText(pop.population.get(4).bitString);
        jBitStringLabel6.setText(pop.population.get(5).bitString);
        jBitStringLabel7.setText(pop.population.get(6).bitString);
        jBitStringLabel8.setText(pop.population.get(7).bitString);
        jBitStringLabel12.setText(pop.population.get(8).bitString);
        jBitStringLabel11.setText(pop.population.get(9).bitString);
        jBitStringLabel10.setText(pop.population.get(10).bitString);
        jBitStringLabel9.setText(pop.population.get(11).bitString);
        jBitStringLabel13.setText(pop.population.get(12).bitString);
        jBitStringLabel14.setText(pop.population.get(13).bitString);
        jBitStringLabel15.setText(pop.population.get(14).bitString);
        jBitStringLabel16.setText(pop.population.get(15).bitString);
	}
	
	public void LevelTwo(){
		
		jLevelValue.setText(Integer.toString(level));
        jMutateButton1.setVisible(true);
        jMutateButton2.setVisible(true);
        jMutateButton3.setVisible(true);
        jMutateButton4.setVisible(true);
        jMutateButton5.setVisible(true);
        jMutateButton6.setVisible(true);
        jMutateButton7.setVisible(true);
        jMutateButton8.setVisible(true);
        jMutateButton9.setVisible(true);
        jMutateButton10.setVisible(true);
        jMutateButton11.setVisible(true);
        jMutateButton12.setVisible(true);
        jMutateButton13.setVisible(true);
        jMutateButton14.setVisible(true);
        jMutateButton15.setVisible(true);
        jMutateButton16.setVisible(true);
        jTextArea.setText("Mutation:\n" + 
        	"A small random modification of\n"
        	+ "a member of the GA population\n\n" + "GA - Genetic Algorithm");
		
	}
    /**
     * Creates new form Level2JFrame
     */
    public GeneticAlgorithmGUI() {
    	initComponets();
       if (level == 1){
    	   init();
    	   } else if (level == 2){
    	  LevelTwo();
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    public void initComponets(){
        jMainPanel = new javax.swing.JPanel();
        jBitStringLabel4 = new javax.swing.JLabel();
        jBitStringLabel3 = new javax.swing.JLabel();
        jBitStringLabel2 = new javax.swing.JLabel();
        jBitStringLabel1 = new javax.swing.JLabel();
        jMutateButton1 = new javax.swing.JButton();
        jMutateButton2 = new javax.swing.JButton();
        jMutateButton4 = new javax.swing.JButton();
        jMutateButton3 = new javax.swing.JButton();
        jSelectCheckBox1 = new javax.swing.JCheckBox();
        jSelectCheckBox2 = new javax.swing.JCheckBox();
        jSelectCheckBox3 = new javax.swing.JCheckBox();
        jSelectCheckBox4 = new javax.swing.JCheckBox();
        jSelectCheckBox5 = new javax.swing.JCheckBox();
        jBitStringLabel5 = new javax.swing.JLabel();
        jMutateButton5 = new javax.swing.JButton();
        jMutateButton6 = new javax.swing.JButton();
        jBitStringLabel6 = new javax.swing.JLabel();
        jSelectCheckBox6 = new javax.swing.JCheckBox();
        jMutateButton7 = new javax.swing.JButton();
        jBitStringLabel7 = new javax.swing.JLabel();
        jSelectCheckBox7 = new javax.swing.JCheckBox();
        jSelectCheckBox8 = new javax.swing.JCheckBox();
        jBitStringLabel8 = new javax.swing.JLabel();
        jMutateButton8 = new javax.swing.JButton();
        jChildrenLabel = new javax.swing.JLabel();
        jFitnessLabel1 = new javax.swing.JLabel();
        jFitnessValueLabel1 = new javax.swing.JLabel();
        jFitnessValueLabel2 = new javax.swing.JLabel();
        jFitnessValueLabel3 = new javax.swing.JLabel();
        jFitnessValueLabel4 = new javax.swing.JLabel();
        jFitnessValueLabel5 = new javax.swing.JLabel();
        jFitnessValueLabel6 = new javax.swing.JLabel();
        jFitnessValueLabel7 = new javax.swing.JLabel();
        jFitnessValueLabel8 = new javax.swing.JLabel();
        jLevelLabel = new javax.swing.JLabel();
        jTargetBitStringLabel = new javax.swing.JLabel();
        jLevelValue = new javax.swing.JLabel();
        jTargetBitStringValue = new javax.swing.JLabel();
        jMainPanel1 = new javax.swing.JPanel();
        jBitStringLabel9 = new javax.swing.JLabel();
        jBitStringLabel10 = new javax.swing.JLabel();
        jBitStringLabel11 = new javax.swing.JLabel();
        jBitStringLabel12 = new javax.swing.JLabel();
        jMutateButton9 = new javax.swing.JButton();
        jMutateButton10 = new javax.swing.JButton();
        jMutateButton11 = new javax.swing.JButton();
        jMutateButton12 = new javax.swing.JButton();
        jSelectCheckBox9 = new javax.swing.JCheckBox();
        jSelectCheckBox10 = new javax.swing.JCheckBox();
        jSelectCheckBox11 = new javax.swing.JCheckBox();
        jSelectCheckBox12 = new javax.swing.JCheckBox();
        jSelectCheckBox13 = new javax.swing.JCheckBox();
        jBitStringLabel13 = new javax.swing.JLabel();
        jMutateButton13 = new javax.swing.JButton();
        jMutateButton14 = new javax.swing.JButton();
        jBitStringLabel14 = new javax.swing.JLabel();
        jSelectCheckBox14 = new javax.swing.JCheckBox();
        jMutateButton15 = new javax.swing.JButton();
        jBitStringLabel15 = new javax.swing.JLabel();
        jSelectCheckBox15 = new javax.swing.JCheckBox();
        jSelectCheckBox16 = new javax.swing.JCheckBox();
        jBitStringLabel16 = new javax.swing.JLabel();
        jMutateButton16 = new javax.swing.JButton();
        jParentLabel = new javax.swing.JLabel();
        jFitnessLabel = new javax.swing.JLabel();
        jFitnessValueLabel9 = new javax.swing.JLabel();
        jFitnessValueLabel10 = new javax.swing.JLabel();
        jFitnessValueLabel11 = new javax.swing.JLabel();
        jFitnessValueLabel12 = new javax.swing.JLabel();
        jFitnessValueLabel13 = new javax.swing.JLabel();
        jFitnessValueLabel14 = new javax.swing.JLabel();
        jFitnessValueLabel15 = new javax.swing.JLabel();
        jFitnessValueLabel16 = new javax.swing.JLabel();
        jMultiPointCrossoverButton = new javax.swing.JButton();
        jSinglePointCrossoverButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jNextGenButton = new javax.swing.JButton();
        jGenerationLabel = new javax.swing.JLabel();
        jGenerationValueLabel = new javax.swing.JLabel();
        jRandomGeneration = new javax.swing.JButton();

       /* setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);   
        setResizable(false);*/
        
        setPreferredSize(new java.awt.Dimension(850, 600));
        
        jMainPanel.setPreferredSize(new java.awt.Dimension(226, 346));

        jBitStringLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel4.setText("Bitstring 4:");

        jBitStringLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel3.setText("Bitstring 3:");

        jBitStringLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel2.setText("Bitstring 2:");

        jBitStringLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel1.setText("Bitstring 1:");

        jMutateButton1.setText("Mutate");
        jMutateButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton1MouseClicked(evt);
            }
        });

        jMutateButton2.setText("Mutate");
        jMutateButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton2MouseClicked(evt);
            }
        });

        jMutateButton4.setText("Mutate");
        jMutateButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton4MouseClicked(evt);
            }
        });

        jMutateButton3.setText("Mutate");
        jMutateButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton3MouseClicked(evt);
            }
        });

        jSelectCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSelectCheckBox1MouseEntered(evt);
            }
        });

        jSelectCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox2MouseClicked(evt);
            }
        });

        jSelectCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox3MouseClicked(evt);
            }
        });

        jSelectCheckBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox5MouseClicked(evt);
            }
        });

        jBitStringLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel5.setText("Bitstring 5:");

        jMutateButton5.setText("Mutate");
        jMutateButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton5MouseClicked(evt);
            }
        });

        jMutateButton6.setText("Mutate");
        jMutateButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton6MouseClicked(evt);
            }
        });

        jBitStringLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel6.setText("Bitstring 6:");

        jSelectCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox6MouseClicked(evt);
            }
        });

        jMutateButton7.setText("Mutate");
        jMutateButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton7MouseClicked(evt);
            }
        });

        jBitStringLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel7.setText("Bitstring 7:");

        jSelectCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox7MouseClicked(evt);
            }
        });

        jSelectCheckBox8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox8MouseClicked(evt);
            }
        });

        jBitStringLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel8.setText("Bitstring 8:");

        jMutateButton8.setText("Mutate");
        jMutateButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton8MouseClicked(evt);
            }
        });

        jChildrenLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jChildrenLabel.setText("Children");

        jFitnessLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFitnessLabel1.setText("Fitness");

        jFitnessValueLabel1.setText("Default");

        jFitnessValueLabel2.setText("Default");

        jFitnessValueLabel3.setText("Default");

        jFitnessValueLabel4.setText("Default");

        jFitnessValueLabel5.setText("Default");

        jFitnessValueLabel6.setText("Default");

        jFitnessValueLabel7.setText("Default");

        jFitnessValueLabel8.setText("Default");

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addComponent(jChildrenLabel)
                        .addGap(126, 126, 126)
                        .addComponent(jFitnessLabel1))
                    .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jMainPanelLayout.createSequentialGroup()
                            .addComponent(jMutateButton6)
                            .addGap(18, 18, 18)
                            .addComponent(jBitStringLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSelectCheckBox6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFitnessValueLabel6))
                        .addGroup(jMainPanelLayout.createSequentialGroup()
                            .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jMutateButton4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBitStringLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jMutateButton3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBitStringLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jMutateButton2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBitStringLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jMutateButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBitStringLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jSelectCheckBox4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFitnessValueLabel4))
                                .addGroup(jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jSelectCheckBox3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFitnessValueLabel3))
                                .addGroup(jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jSelectCheckBox2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFitnessValueLabel2))
                                .addGroup(jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jSelectCheckBox1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFitnessValueLabel1))))
                        .addGroup(jMainPanelLayout.createSequentialGroup()
                            .addComponent(jMutateButton5)
                            .addGap(18, 18, 18)
                            .addComponent(jBitStringLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSelectCheckBox5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFitnessValueLabel5))
                        .addGroup(jMainPanelLayout.createSequentialGroup()
                            .addComponent(jMutateButton7)
                            .addGap(18, 18, 18)
                            .addComponent(jBitStringLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSelectCheckBox7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFitnessValueLabel7))
                        .addGroup(jMainPanelLayout.createSequentialGroup()
                            .addComponent(jMutateButton8)
                            .addGap(18, 18, 18)
                            .addComponent(jBitStringLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSelectCheckBox8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFitnessValueLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChildrenLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFitnessLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSelectCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBitStringLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMutateButton1)))
                    .addComponent(jFitnessValueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBitStringLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMutateButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBitStringLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMutateButton3)))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSelectCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFitnessValueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSelectCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFitnessValueLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBitStringLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMutateButton4)
                    .addComponent(jSelectCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFitnessValueLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBitStringLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMutateButton5)
                    .addComponent(jSelectCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFitnessValueLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBitStringLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMutateButton6)
                    .addComponent(jSelectCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFitnessValueLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBitStringLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMutateButton7)
                    .addComponent(jSelectCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFitnessValueLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBitStringLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMutateButton8)
                    .addComponent(jSelectCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFitnessValueLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLevelLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLevelLabel.setText("Level: ");

        jTargetBitStringLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTargetBitStringLabel.setText("Target BitString: ");

        jLevelValue.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLevelValue.setText("Default");

        jTargetBitStringValue.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTargetBitStringValue.setText("Default");

        jBitStringLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel9.setText("Bitstring 4:");

        jBitStringLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel10.setText("Bitstring 3:");

        jBitStringLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel11.setText("Bitstring 2:");

        jBitStringLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel12.setText("Bitstring 1:");

        jMutateButton9.setText("Mutate");
        jMutateButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton9MouseClicked(evt);
            }
        });

        jMutateButton10.setText("Mutate");
        jMutateButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton10MouseClicked(evt);
            }
        });

        jMutateButton11.setText("Mutate");
        jMutateButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton11MouseClicked(evt);
            }
        });

        jMutateButton12.setText("Mutate");
        jMutateButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton12MouseClicked(evt);
            }
        });

        jSelectCheckBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox9MouseClicked(evt);
            }
        });

        jSelectCheckBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox10MouseClicked(evt);
            }
        });

        jSelectCheckBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox11MouseClicked(evt);
            }
        });

        jSelectCheckBox12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox12MouseClicked(evt);
            }
        });

        jSelectCheckBox13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox13MouseClicked(evt);
            }
        });

        jBitStringLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel13.setText("Bitstring 5:");

        jMutateButton13.setText("Mutate");
        jMutateButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton13MouseClicked(evt);
            }
        });

        jMutateButton14.setText("Mutate");
        jMutateButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton14MouseClicked(evt);
            }
        });

        jBitStringLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel14.setText("Bitstring 6:");

        jSelectCheckBox14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox14MouseClicked(evt);
            }
        });

        jMutateButton15.setText("Mutate");
        jMutateButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton15MouseClicked(evt);
            }
        });

        jBitStringLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel15.setText("Bitstring 7:");

        jSelectCheckBox15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox15MouseClicked(evt);
            }
        });

        jSelectCheckBox16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSelectCheckBox16MouseClicked(evt);
            }
        });

        jBitStringLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBitStringLabel16.setText("Bitstring 8:");

        jMutateButton16.setText("Mutate");
        jMutateButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMutateButton16MouseClicked(evt);
            }
        });

        jParentLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jParentLabel.setText("Parent");

        jFitnessLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFitnessLabel.setText("Fitness");

        jFitnessValueLabel9.setText("Default");

        jFitnessValueLabel10.setText("Default");

        jFitnessValueLabel11.setText("Default");

        jFitnessValueLabel12.setText("Default");

        jFitnessValueLabel13.setText("Default");

        jFitnessValueLabel14.setText("Default");

        jFitnessValueLabel15.setText("Default");

        jFitnessValueLabel16.setText("Default");

        javax.swing.GroupLayout jMainPanel1Layout = new javax.swing.GroupLayout(jMainPanel1);
        jMainPanel1.setLayout(jMainPanel1Layout);
        jMainPanel1Layout.setHorizontalGroup(
            jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanel1Layout.createSequentialGroup()
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jMainPanel1Layout.createSequentialGroup()
                                .addComponent(jMutateButton14)
                                .addGap(18, 18, 18)
                                .addComponent(jBitStringLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSelectCheckBox14))
                            .addGroup(jMainPanel1Layout.createSequentialGroup()
                                .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanel1Layout.createSequentialGroup()
                                        .addComponent(jMutateButton11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBitStringLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanel1Layout.createSequentialGroup()
                                        .addComponent(jMutateButton12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBitStringLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanel1Layout.createSequentialGroup()
                                        .addComponent(jMutateButton10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBitStringLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanel1Layout.createSequentialGroup()
                                        .addComponent(jMutateButton9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBitStringLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSelectCheckBox9)
                                    .addComponent(jSelectCheckBox12)
                                    .addComponent(jSelectCheckBox11)
                                    .addComponent(jSelectCheckBox10)))
                            .addGroup(jMainPanel1Layout.createSequentialGroup()
                                .addComponent(jMutateButton13)
                                .addGap(18, 18, 18)
                                .addComponent(jBitStringLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSelectCheckBox13))
                            .addGroup(jMainPanel1Layout.createSequentialGroup()
                                .addComponent(jMutateButton15)
                                .addGap(18, 18, 18)
                                .addComponent(jBitStringLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSelectCheckBox15))
                            .addGroup(jMainPanel1Layout.createSequentialGroup()
                                .addComponent(jMutateButton16)
                                .addGap(18, 18, 18)
                                .addComponent(jBitStringLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSelectCheckBox16)))
                        .addGap(18, 18, 18)
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFitnessValueLabel14)
                            .addComponent(jFitnessValueLabel12)
                            .addComponent(jFitnessValueLabel11)
                            .addComponent(jFitnessValueLabel10)
                            .addComponent(jFitnessValueLabel9)
                            .addComponent(jFitnessValueLabel13)
                            .addComponent(jFitnessValueLabel15)
                            .addComponent(jFitnessValueLabel16))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jMainPanel1Layout.createSequentialGroup()
                        .addComponent(jParentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFitnessLabel)))
                .addContainerGap())
        );
        jMainPanel1Layout.setVerticalGroup(
            jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jParentLabel)
                    .addComponent(jFitnessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanel1Layout.createSequentialGroup()
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSelectCheckBox9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBitStringLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jMutateButton9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jMainPanel1Layout.createSequentialGroup()
                                .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBitStringLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMutateButton10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBitStringLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMutateButton12)))
                            .addGroup(jMainPanel1Layout.createSequentialGroup()
                                .addComponent(jSelectCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSelectCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBitStringLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMutateButton11)
                            .addComponent(jSelectCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBitStringLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMutateButton13)
                            .addComponent(jSelectCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBitStringLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMutateButton14)
                            .addComponent(jSelectCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBitStringLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMutateButton15)
                            .addComponent(jSelectCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jMainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBitStringLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMutateButton16)
                            .addComponent(jSelectCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jMainPanel1Layout.createSequentialGroup()
                        .addComponent(jFitnessValueLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFitnessValueLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFitnessValueLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFitnessValueLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFitnessValueLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFitnessValueLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFitnessValueLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFitnessValueLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jMultiPointCrossoverButton.setText("Multi-Point Crossover");
        jMultiPointCrossoverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMultiPointCrossoverButtonMouseClicked(evt);
            }
        });

        jSinglePointCrossoverButton1.setText("Single-Point Crossover");
        jSinglePointCrossoverButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSinglePointCrossoverButton1MouseClicked(evt);
            }
        });

        jTextArea.setEditable(false);
        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.setText("Default Text");
        jScrollPane1.setViewportView(jTextArea);

        jNextGenButton.setText("Next Generation");
        jNextGenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNextGenButtonMouseClicked(evt);
            }
        });

        jGenerationLabel.setText("Generation: ");

        jGenerationValueLabel.setText("Default");

        jRandomGeneration.setText("Random Selection");
        jRandomGeneration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHiddenButtonMouseClicked(evt);
            }
        });
        jRandomGeneration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHiddenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLevelLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLevelValue))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTargetBitStringLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTargetBitStringValue)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jRandomGeneration)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jNextGenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSinglePointCrossoverButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jGenerationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGenerationValueLabel))
                            .addComponent(jMultiPointCrossoverButton))
                        .addGap(191, 191, 191))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jMainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 129, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLevelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLevelValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTargetBitStringLabel)
                    .addComponent(jTargetBitStringValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNextGenButton)
                    .addComponent(jGenerationLabel)
                    .addComponent(jGenerationValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSinglePointCrossoverButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jMultiPointCrossoverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRandomGeneration)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jMainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        //pack();
    }// </editor-fold>                        

    private void jHiddenButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    }                                             

    private void jSinglePointCrossoverButton1MouseClicked(java.awt.event.MouseEvent evt) {                                                          
    	int total = countSelected();
    	int first= 0;
    	int second=0;
    	Random rng = new Random();
    	int index = rng.nextInt(pop.population.get(1).maxLength);
    	
    	if (total == 2){
    		first = getSecond();
    		second = getFirst();
    		
	    	Member childOne = new Member(pop.childOneSPC(pop.population.get(first), pop.population.get(second), index));
	    	Member childTwo = new Member(pop.childTwoSPC(pop.population.get(first), pop.population.get(second), index));
	    	
	    	pop.removeMember(pop.population.get(first));
	    	pop.removeMember(pop.population.get(second));
	    	pop.population.add(second,childOne);
	    	pop.population.add(first,childTwo);
	    	
	    	updateBitStrings(pop);
    	}
    	else if (total == 16){
    		levelComplete("WHOA NELLY.. you can only pick two", "only pick two");
    	}
    	else{
    		levelComplete("Can only choose two options", "only pick two");		
    	}
    	
    	if (CheckForVictory())
    	{
    		levelComplete("Congratulation", "Level Up");
    		if (level == 1){
	    		level++;
	    		jLevelValue.setText(Integer.toString(level));
	    		pop = new Population("110110", 16);
	    		updateBitStrings(pop);
	    		jTargetBitStringValue.setText(pop.target.bitString);
	    		LevelTwo();
	    		jSinglePointCrossoverButton1.setVisible(false);
	    	}
    	}
    }
    
    private int getSecond(){
    	if (jSelectCheckBox16.isSelected()){
    		return 15;
    	}
    	if (jSelectCheckBox15.isSelected()){
    		return 14;
    	}
    	if (jSelectCheckBox14.isSelected()){
    		return 13;
    	}
    	if (jSelectCheckBox13.isSelected()){
    		return 12;
    	}
    	if (jSelectCheckBox12.isSelected()){
    		return 11;
    	}
    	if (jSelectCheckBox11.isSelected()){
    		return 10;
    	}
    	if (jSelectCheckBox10.isSelected()){
    		return 9;
    	}
    	if (jSelectCheckBox9.isSelected()){
    		return 8;
    	}
    	if (jSelectCheckBox8.isSelected()){
    		return 7;
    	}
    	if (jSelectCheckBox7.isSelected()){
    		return 6;
    	}
    	if (jSelectCheckBox6.isSelected()){
    		return 5;
    	}
    	if (jSelectCheckBox5.isSelected()){
    		return 4;
    	}
    	if (jSelectCheckBox4.isSelected()){
    		return 3;
    	}
    	if (jSelectCheckBox3.isSelected()){
    		return 2;
    	}
    	if (jSelectCheckBox2.isSelected()){
    		return 1;
    	}
    	if (jSelectCheckBox1.isSelected()){
    		return 0;
    	}
    	
    	return 0;
    	
    }
    
    private int getFirst(){
    	if (jSelectCheckBox1.isSelected()){
    		return 0;
    	}
    	if (jSelectCheckBox2.isSelected()){
    		return 1;
    	}
    	if (jSelectCheckBox3.isSelected()){
    		return 2;
    	}
    	if (jSelectCheckBox4.isSelected()){
    		return 3;
    	}
    	if (jSelectCheckBox5.isSelected()){
    		return 4;
    	}
    	if (jSelectCheckBox6.isSelected()){
    		return 5;
    	}
    	if (jSelectCheckBox7.isSelected()){
    		return 6;
    	}
    	if (jSelectCheckBox8.isSelected()){
    		return 7;
    	}
    	if (jSelectCheckBox9.isSelected()){
    		return 8;
    	}
    	if (jSelectCheckBox10.isSelected()){
    		return 9;
    	}
    	if (jSelectCheckBox11.isSelected()){
    		return 10;
    	}
    	if (jSelectCheckBox12.isSelected()){
    		return 11;
    	}
    	if (jSelectCheckBox13.isSelected()){
    		return 12;
    	}
    	if (jSelectCheckBox14.isSelected()){
    		return 13;
    	}
    	if (jSelectCheckBox15.isSelected()){
    		return 14;
    	}
    	if (jSelectCheckBox16.isSelected()){
    		return 15;
    	}
    	
    	return 0;
    	
    }
	private int countSelected() {
		int numSelected = 0;
    	if (jSelectCheckBox1.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox2.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox3.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox4.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox5.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox6.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox7.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox8.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox9.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox10.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox11.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox12.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox13.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox14.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox15.isSelected()){
    		numSelected++;
    	}
    	if (jSelectCheckBox16.isSelected()){
    		numSelected++;
    	}
    	return numSelected;
	}                                                         

    private void jMultiPointCrossoverButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                        
    	int total =countSelected();
    	int first= 0;
    	int second=0;
    	Random rng = new Random();
    	int index1 = rng.nextInt(pop.population.get(1).maxLength);
    	int index2 = rng.nextInt(pop.population.get(1).maxLength);
    	
    	if (total == 2){
    		first = getSecond();
    		second = getFirst();
    		
	    	Member childOne = new Member(pop.childOneTPC(pop.population.get(first), pop.population.get(second), index1, index2));
	    	Member childTwo = new Member(pop.childTwoTPC(pop.population.get(first), pop.population.get(second), index1, index2));
	    	
	    	pop.removeMember(pop.population.get(first));
	    	pop.removeMember(pop.population.get(second));
	    	pop.population.add(second,childOne);
	    	pop.population.add(first,childTwo);
	    	
	    	updateBitStrings(pop);
    	}
    	if (CheckForVictory())
    	{
    		levelComplete("Congratulation", "Level Up");
    		level++;
    		jLevelValue.setText(Integer.toString(level));
    	}
    }                                                       

    private void jNextGenButtonMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jHiddenButtonMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMutateButton9MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(8).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(8)));
    	pop.population.remove(8);
    	pop.population.add(8, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	
    	mutates++;
    }                                           

    private void jMutateButton10MouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
    	double mutationRate = 1.0 / pop.population.get(9).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(9)));
    	pop.population.remove(9);
    	pop.population.add(9, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                            

    private void jMutateButton12MouseClicked(java.awt.event.MouseEvent evt) {                                             
    	double mutationRate = 1.0 / pop.population.get(10).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(10)));
    	pop.population.remove(10);
    	pop.population.add(10, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                            

    private void jMutateButton11MouseClicked(java.awt.event.MouseEvent evt) {                                             
    	double mutationRate = 1.0 / pop.population.get(11).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(11)));
    	pop.population.remove(11);
    	pop.population.add(11, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                            

    private void jMutateButton13MouseClicked(java.awt.event.MouseEvent evt) {                                             
    	double mutationRate = 1.0 / pop.population.get(12).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(12)));
    	pop.population.remove(12);
    	pop.population.add(12, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                            

    private void jMutateButton14MouseClicked(java.awt.event.MouseEvent evt) {                                             
    	double mutationRate = 1.0 / pop.population.get(13).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(13)));
    	pop.population.remove(13);
    	pop.population.add(13, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                            

    private void jMutateButton15MouseClicked(java.awt.event.MouseEvent evt) {                                             
    	double mutationRate = 1.0 / pop.population.get(14).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(14)));
    	pop.population.remove(14);
    	pop.population.add(14, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                            

    private void jMutateButton16MouseClicked(java.awt.event.MouseEvent evt) {                                             
    	double mutationRate = 1.0 / pop.population.get(15).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(15)));
    	pop.population.remove(15);
    	pop.population.add(15, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                            

    private void jMutateButton1MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(0).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(0)));
    	pop.population.remove(0);
    	pop.population.add(0, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                           

    private void jMutateButton2MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(1).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(1)));
    	pop.population.remove(1);
    	pop.population.add(1, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                           

    private void jMutateButton3MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(2).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(2)));
    	pop.population.remove(2);
    	pop.population.add(2, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                           

    private void jMutateButton4MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(3).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(3)));
    	pop.population.remove(3);
    	pop.population.add(3, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                           

    private void jMutateButton5MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(4).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(4)));
    	pop.population.remove(4);
    	pop.population.add(4, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                           

    private void jMutateButton6MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(5).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(5)));
    	pop.population.remove(5);
    	pop.population.add(5, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                           

    private void jMutateButton7MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(6).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(6)));
    	pop.population.remove(6);
    	pop.population.add(6, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                           

    private void jMutateButton8MouseClicked(java.awt.event.MouseEvent evt) {                                            
    	double mutationRate = 1.0 / pop.population.get(7).maxLength;
    	Member mutant = new Member(pop.mutate(mutationRate, pop.population.get(7)));
    	pop.population.remove(7);
    	pop.population.add(7, mutant);
    	updateBitStrings(pop);
    	checkForVictoryMutate();
    	mutates++;
    }                                           

    private void jSelectCheckBox16MouseClicked(java.awt.event.MouseEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jSelectCheckBox15MouseClicked(java.awt.event.MouseEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jSelectCheckBox14MouseClicked(java.awt.event.MouseEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jSelectCheckBox13MouseClicked(java.awt.event.MouseEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jSelectCheckBox12MouseClicked(java.awt.event.MouseEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jSelectCheckBox11MouseClicked(java.awt.event.MouseEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jSelectCheckBox10MouseClicked(java.awt.event.MouseEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jSelectCheckBox9MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jSelectCheckBox1MouseEntered(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jSelectCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jSelectCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jSelectCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jSelectCheckBox5MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jSelectCheckBox6MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jSelectCheckBox7MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jSelectCheckBox8MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    /**
     * @param args the command line arguments
     */
    
    public void start() {
        new GeneticAlgorithmGUI().setVisible(true);
    }

    public void stop() {
        
    }

    public void destroy() {
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jBitStringLabel1;
    private javax.swing.JLabel jBitStringLabel10;
    private javax.swing.JLabel jBitStringLabel11;
    private javax.swing.JLabel jBitStringLabel12;
    private javax.swing.JLabel jBitStringLabel13;
    private javax.swing.JLabel jBitStringLabel14;
    private javax.swing.JLabel jBitStringLabel15;
    private javax.swing.JLabel jBitStringLabel16;
    private javax.swing.JLabel jBitStringLabel2;
    private javax.swing.JLabel jBitStringLabel3;
    private javax.swing.JLabel jBitStringLabel4;
    private javax.swing.JLabel jBitStringLabel5;
    private javax.swing.JLabel jBitStringLabel6;
    private javax.swing.JLabel jBitStringLabel7;
    private javax.swing.JLabel jBitStringLabel8;
    private javax.swing.JLabel jBitStringLabel9;
    private javax.swing.JLabel jChildrenLabel;
    private javax.swing.JLabel jFitnessLabel;
    private javax.swing.JLabel jFitnessLabel1;
    private javax.swing.JLabel jFitnessValueLabel1;
    private javax.swing.JLabel jFitnessValueLabel10;
    private javax.swing.JLabel jFitnessValueLabel11;
    private javax.swing.JLabel jFitnessValueLabel12;
    private javax.swing.JLabel jFitnessValueLabel13;
    private javax.swing.JLabel jFitnessValueLabel14;
    private javax.swing.JLabel jFitnessValueLabel15;
    private javax.swing.JLabel jFitnessValueLabel16;
    private javax.swing.JLabel jFitnessValueLabel2;
    private javax.swing.JLabel jFitnessValueLabel3;
    private javax.swing.JLabel jFitnessValueLabel4;
    private javax.swing.JLabel jFitnessValueLabel5;
    private javax.swing.JLabel jFitnessValueLabel6;
    private javax.swing.JLabel jFitnessValueLabel7;
    private javax.swing.JLabel jFitnessValueLabel8;
    private javax.swing.JLabel jFitnessValueLabel9;
    private javax.swing.JButton jRandomGeneration;
    private javax.swing.JLabel jLevelValue;
    private javax.swing.JLabel jTargetBitStringValue;
    private javax.swing.JLabel jGenerationLabel;
    private javax.swing.JLabel jGenerationValueLabel;
    private javax.swing.JLabel jLevelLabel;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JPanel jMainPanel1;
    private javax.swing.JButton jMultiPointCrossoverButton;
    private javax.swing.JButton jMutateButton1;
    private javax.swing.JButton jMutateButton10;
    private javax.swing.JButton jMutateButton11;
    private javax.swing.JButton jMutateButton12;
    private javax.swing.JButton jMutateButton13;
    private javax.swing.JButton jMutateButton14;
    private javax.swing.JButton jMutateButton15;
    private javax.swing.JButton jMutateButton16;
    private javax.swing.JButton jMutateButton2;
    private javax.swing.JButton jMutateButton3;
    private javax.swing.JButton jMutateButton4;
    private javax.swing.JButton jMutateButton5;
    private javax.swing.JButton jMutateButton6;
    private javax.swing.JButton jMutateButton7;
    private javax.swing.JButton jMutateButton8;
    private javax.swing.JButton jMutateButton9;
    private javax.swing.JButton jNextGenButton;
    private javax.swing.JLabel jParentLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jSelectCheckBox1;
    private javax.swing.JCheckBox jSelectCheckBox10;
    private javax.swing.JCheckBox jSelectCheckBox11;
    private javax.swing.JCheckBox jSelectCheckBox12;
    private javax.swing.JCheckBox jSelectCheckBox13;
    private javax.swing.JCheckBox jSelectCheckBox14;
    private javax.swing.JCheckBox jSelectCheckBox15;
    private javax.swing.JCheckBox jSelectCheckBox16;
    private javax.swing.JCheckBox jSelectCheckBox2;
    private javax.swing.JCheckBox jSelectCheckBox3;
    private javax.swing.JCheckBox jSelectCheckBox4;
    private javax.swing.JCheckBox jSelectCheckBox5;
    private javax.swing.JCheckBox jSelectCheckBox6;
    private javax.swing.JCheckBox jSelectCheckBox7;
    private javax.swing.JCheckBox jSelectCheckBox8;
    private javax.swing.JCheckBox jSelectCheckBox9;
    private javax.swing.JButton jSinglePointCrossoverButton1;
    private javax.swing.JLabel jTargetBitStringLabel;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration                   
}