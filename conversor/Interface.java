package conversor;

public class Interface extends javax.swing.JFrame {
    
    String cantidad1, cantidad2, cantidad3, cantidad4, cantidad5;
    String dolares, colones, euros, pesosColombianos, pesosMexicanos;
    double totdol, totcolo, toteur, totcol, totmex;

    public Interface() {
        initComponents();
        this.setLocationRelativeTo(this);
        logoUSD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usa-48.png")));
        logoUSD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usa-48.png")));
        logoUSD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usa-48.png")));
        logoUSD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usa-48.png")));
        
        logoCRC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-costa-rica-48.png")));
        logoCRC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-costa-rica-48.png")));
        logoCRC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-costa-rica-48.png")));
        logoCRC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-costa-rica-48.png")));
        
        logoEUR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        logoEUR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        logoEUR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        logoEUR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        
        logoCOL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        logoCOL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        logoCOL3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        logoCOL4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        
        logoMEX1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
        logoMEX2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
        logoMEX3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
        logoMEX4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
        
        CRC0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-costa-rica-48.png")));
        EUR0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        COL0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        MEX0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
        
        USA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usa-48.png")));
        EUR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        COL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        MEX1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
        
        USA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usa-48.png")));
        CRC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        COL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        MEX2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
        
        USA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usa-48.png")));
        CRC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        EUR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        MEX3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
        
        USA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usa-48.png")));
        CRC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spain-48.png")));
        EUR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-colombia-48.png")));
        COL4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-mexico-48.png")));
    }
    
    public void obtenerDatos() {
        cantidad1 = cantidadTextField.getText();
        cantidad2 = cantidadTextFieldcrcpanel.getText();
        cantidad3 = cantidadTextFieldeurpanel.getText();
        cantidad4 = cantidadTextFieldcolpanel.getText();
        cantidad5 = cantidadTextFieldmexpanel.getText();
    }
    
    public void dolaresAcolones() {
        obtenerDatos();
        totcolo = Integer.parseInt(cantidad1)*586.42;
        int vs = (int) totcolo;
        colones = Integer.toString(vs);
        cantidadCovertidaLabel.setText(colones);
    }
    
    public void dolaresAeuros() {
        obtenerDatos();
        toteur = Integer.parseInt(cantidad1)*0.951850;
        int vs = (int) toteur;
        euros = Integer.toString(vs);
        cantidadCovertidaLabel.setText(euros);
    }
    
    public void dolaresApesosColombianos() {
        obtenerDatos();
        totcol = Integer.parseInt(cantidad1)*4822.81;
        int vs = (int) totcol;
        pesosColombianos = Integer.toString(vs);
        cantidadCovertidaLabel.setText(pesosColombianos);
    }
    
    public void dolaresApesosMexicanos() {
        obtenerDatos();
        totmex = Integer.parseInt(cantidad1)*19.27;
        int vs = (int) totmex;
        pesosMexicanos = Integer.toString(vs);
        cantidadCovertidaLabel.setText(pesosMexicanos);
    }
    
    public void colonesAdolares() {
        obtenerDatos();
        totdol = Integer.parseInt(cantidad2)*0.0017;
        int vs = (int) totdol;
        dolares = Integer.toString(vs);
        cantidadCovertidaLabelcrcpanel.setText(dolares);
    }
    
    public void colonesAeuros() {
        obtenerDatos();
        toteur = Integer.parseInt(cantidad2)*0.0016;
        int vs = (int) toteur;
        euros = Integer.toString(vs);
        cantidadCovertidaLabelcrcpanel.setText(euros);
    }
    
    public void colonesApesosColombianos() {
        obtenerDatos();
        totcol = Integer.parseInt(cantidad2)*8.01;
        int vs = (int) totcol;
        pesosColombianos = Integer.toString(vs);
        cantidadCovertidaLabelcrcpanel.setText(pesosColombianos);
    }
    
    public void colonesApesosMexicanos() {
        obtenerDatos();
        totmex = Integer.parseInt(cantidad2)*0.033;
        int vs = (int) totmex;
        pesosMexicanos = Integer.toString(vs);
        cantidadCovertidaLabelcrcpanel.setText(pesosMexicanos);
    }
    
    public void eurosAdolares() {
        obtenerDatos();
        totdol = Integer.parseInt(cantidad3)*1.05;
        int vs = (int) totdol;
        dolares = Integer.toString(vs);
        cantidadCovertidaLabeleurpanel.setText(dolares);
    }
    
    public void eurosAcolones() {
        obtenerDatos();
        totcolo = Integer.parseInt(cantidad3)*632.31;
        int vs = (int) totcolo;
        colones = Integer.toString(vs);
        cantidadCovertidaLabeleurpanel.setText(colones);
    }
    
    public void eurosApesosColombianos() {
        obtenerDatos();
        totcol = Integer.parseInt(cantidad3)*5065.27;
        int vs = (int) totcol;
        pesosColombianos = Integer.toString(vs);
        cantidadCovertidaLabeleurpanel.setText(pesosColombianos);
    }
    
    public void eurosApesosMexicanos() {
        obtenerDatos();
        totmex = Integer.parseInt(cantidad3)*20.66;
        int vs = (int) totmex;
        pesosMexicanos = Integer.toString(vs);
        cantidadCovertidaLabeleurpanel.setText(pesosMexicanos);
    }
    
    public void pesosColombianosAdolares() {
        obtenerDatos();
        totdol = Integer.parseInt(cantidad4)*0.00021;
        int vs = (int) totdol;
        dolares = Integer.toString(vs);
        cantidadCovertidaLabelcolpanel.setText(dolares);
    }
    
    public void  pesosColombianosAcolones() {
        obtenerDatos();
        totcol = Integer.parseInt(cantidad4)*0.12;
        int vs = (int) totcolo;
        colones = Integer.toString(vs);
        cantidadCovertidaLabelcolpanel.setText(colones);
    }
    
    public void  pesosColombianosAeuros() {
        obtenerDatos();
        toteur = Integer.parseInt(cantidad4)*0.00020;
        int vs = (int) toteur;
        euros = Integer.toString(vs);
        cantidadCovertidaLabelcolpanel.setText(euros);
    }
    
    public void  pesosColombianosApesosMexicanos() {
        obtenerDatos();
        totmex = Integer.parseInt(cantidad4)*0.0041;
        pesosMexicanos = Integer.toString((int) totmex);
        int vs = (int) totmex;
        pesosMexicanos = Integer.toString(vs);
        cantidadCovertidaLabelcolpanel.setText(pesosMexicanos);
    }
    
    public void pesosMexicanosAdolares() {
        obtenerDatos();
        totdol = Integer.parseInt(cantidad5)*0.051;
        int vs = (int) totdol;
        dolares = Integer.toString(vs);
        cantidadCovertidaLabelmexpanel.setText(dolares);
    }
    
    public void pesosMexicanosAcolones() {
        obtenerDatos();
        totcolo = Integer.parseInt(cantidad5)*30.60;
        int vs = (int) totcolo;
        colones = Integer.toString(vs);
        cantidadCovertidaLabelmexpanel.setText(colones);
    }
    
     public void pesosMexicanosAeuros() {
        obtenerDatos();
        toteur = Integer.parseInt(cantidad5)*0.048;
        int vs = (int) toteur;
        euros = Integer.toString(vs);
        cantidadCovertidaLabelmexpanel.setText(euros);
    }
    
    public void pesosMexicanosApesosColombianos() {
        obtenerDatos();
        totcol = Integer.parseInt(cantidad5)*245.11;
        int vs = (int) totcol;
        pesosColombianos = Integer.toString(vs);
        cantidadCovertidaLabelmexpanel.setText(pesosColombianos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        R = new javax.swing.JPanel();
        jPanel1Colors = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bordesRedondeados15 = new conversor.BordesRedondeados();
        mexpanelButton = new javax.swing.JButton();
        bordesRedondeados16 = new conversor.BordesRedondeados();
        usapanelButton = new javax.swing.JButton();
        bordesRedondeados18 = new conversor.BordesRedondeados();
        crcpanelButton = new javax.swing.JButton();
        bordesRedondeados20 = new conversor.BordesRedondeados();
        eurpanelButton = new javax.swing.JButton();
        bordesRedondeados22 = new conversor.BordesRedondeados();
        colpanelButton = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        usapanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bordesRedondeados3 = new conversor.BordesRedondeados();
        jLabel4 = new javax.swing.JLabel();
        CRC0 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bordesRedondeados4 = new conversor.BordesRedondeados();
        cantidadTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cantidadCovertidaLabel = new javax.swing.JLabel();
        bordesRedondeados6 = new conversor.BordesRedondeados();
        jLabel7 = new javax.swing.JLabel();
        logoUSD2 = new javax.swing.JLabel();
        bordesRedondeados7 = new conversor.BordesRedondeados();
        jLabel9 = new javax.swing.JLabel();
        EUR0 = new javax.swing.JLabel();
        bordesRedondeados8 = new conversor.BordesRedondeados();
        jLabel10 = new javax.swing.JLabel();
        logoUSD3 = new javax.swing.JLabel();
        bordesRedondeados9 = new conversor.BordesRedondeados();
        jLabel12 = new javax.swing.JLabel();
        COL0 = new javax.swing.JLabel();
        bordesRedondeados10 = new conversor.BordesRedondeados();
        jLabel13 = new javax.swing.JLabel();
        logoUSD4 = new javax.swing.JLabel();
        bordesRedondeados11 = new conversor.BordesRedondeados();
        jLabel15 = new javax.swing.JLabel();
        MEX0 = new javax.swing.JLabel();
        bordesRedondeados13 = new conversor.BordesRedondeados();
        convertirButton = new javax.swing.JButton();
        bordesRedondeados12 = new conversor.BordesRedondeados();
        jLabel16 = new javax.swing.JLabel();
        logoUSD1 = new javax.swing.JLabel();
        checkMEX = new javax.swing.JCheckBox();
        checkCRC = new javax.swing.JCheckBox();
        checkEUR = new javax.swing.JCheckBox();
        checkCOL = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        eurpanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        bordesRedondeados34 = new conversor.BordesRedondeados();
        jLabel25 = new javax.swing.JLabel();
        USA2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bordesRedondeados35 = new conversor.BordesRedondeados();
        cantidadTextFieldeurpanel = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        cantidadCovertidaLabeleurpanel = new javax.swing.JLabel();
        bordesRedondeados36 = new conversor.BordesRedondeados();
        jLabel27 = new javax.swing.JLabel();
        logoEUR2 = new javax.swing.JLabel();
        bordesRedondeados37 = new conversor.BordesRedondeados();
        jLabel28 = new javax.swing.JLabel();
        CRC2 = new javax.swing.JLabel();
        bordesRedondeados38 = new conversor.BordesRedondeados();
        jLabel29 = new javax.swing.JLabel();
        logoEUR3 = new javax.swing.JLabel();
        bordesRedondeados39 = new conversor.BordesRedondeados();
        jLabel30 = new javax.swing.JLabel();
        COL2 = new javax.swing.JLabel();
        bordesRedondeados40 = new conversor.BordesRedondeados();
        jLabel31 = new javax.swing.JLabel();
        logoEUR4 = new javax.swing.JLabel();
        bordesRedondeados41 = new conversor.BordesRedondeados();
        jLabel32 = new javax.swing.JLabel();
        MEX2 = new javax.swing.JLabel();
        bordesRedondeados42 = new conversor.BordesRedondeados();
        convertirButtoneurpanel = new javax.swing.JButton();
        bordesRedondeados43 = new conversor.BordesRedondeados();
        jLabel33 = new javax.swing.JLabel();
        logoEUR1 = new javax.swing.JLabel();
        checkMEXeurpanel = new javax.swing.JCheckBox();
        checkUSDeurpanel = new javax.swing.JCheckBox();
        checkCRCeurpanel = new javax.swing.JCheckBox();
        checkCOLeurpanel = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        crcpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bordesRedondeados24 = new conversor.BordesRedondeados();
        jLabel8 = new javax.swing.JLabel();
        USA1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bordesRedondeados25 = new conversor.BordesRedondeados();
        cantidadTextFieldcrcpanel = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cantidadCovertidaLabelcrcpanel = new javax.swing.JLabel();
        bordesRedondeados26 = new conversor.BordesRedondeados();
        jLabel14 = new javax.swing.JLabel();
        logoCRC2 = new javax.swing.JLabel();
        bordesRedondeados27 = new conversor.BordesRedondeados();
        jLabel17 = new javax.swing.JLabel();
        EUR1 = new javax.swing.JLabel();
        bordesRedondeados28 = new conversor.BordesRedondeados();
        jLabel18 = new javax.swing.JLabel();
        logoCRC3 = new javax.swing.JLabel();
        bordesRedondeados29 = new conversor.BordesRedondeados();
        jLabel19 = new javax.swing.JLabel();
        COL1 = new javax.swing.JLabel();
        bordesRedondeados30 = new conversor.BordesRedondeados();
        jLabel20 = new javax.swing.JLabel();
        logoCRC4 = new javax.swing.JLabel();
        bordesRedondeados31 = new conversor.BordesRedondeados();
        jLabel21 = new javax.swing.JLabel();
        MEX1 = new javax.swing.JLabel();
        bordesRedondeados32 = new conversor.BordesRedondeados();
        convertirButtoncrcpanel = new javax.swing.JButton();
        bordesRedondeados33 = new conversor.BordesRedondeados();
        jLabel22 = new javax.swing.JLabel();
        logoCRC1 = new javax.swing.JLabel();
        checkMEXcrcpanel = new javax.swing.JCheckBox();
        checkUSDcrcpanel = new javax.swing.JCheckBox();
        checkEURcrcpanel = new javax.swing.JCheckBox();
        checkCOLcrcpanel = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        colpanel = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        bordesRedondeados44 = new conversor.BordesRedondeados();
        jLabel36 = new javax.swing.JLabel();
        USA3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        bordesRedondeados45 = new conversor.BordesRedondeados();
        cantidadTextFieldcolpanel = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        cantidadCovertidaLabelcolpanel = new javax.swing.JLabel();
        bordesRedondeados46 = new conversor.BordesRedondeados();
        jLabel38 = new javax.swing.JLabel();
        logoCOL2 = new javax.swing.JLabel();
        bordesRedondeados47 = new conversor.BordesRedondeados();
        jLabel39 = new javax.swing.JLabel();
        CRC3 = new javax.swing.JLabel();
        bordesRedondeados48 = new conversor.BordesRedondeados();
        jLabel40 = new javax.swing.JLabel();
        logoCOL3 = new javax.swing.JLabel();
        bordesRedondeados49 = new conversor.BordesRedondeados();
        jLabel41 = new javax.swing.JLabel();
        EUR3 = new javax.swing.JLabel();
        bordesRedondeados50 = new conversor.BordesRedondeados();
        jLabel42 = new javax.swing.JLabel();
        logoCOL4 = new javax.swing.JLabel();
        bordesRedondeados51 = new conversor.BordesRedondeados();
        jLabel43 = new javax.swing.JLabel();
        MEX3 = new javax.swing.JLabel();
        bordesRedondeados52 = new conversor.BordesRedondeados();
        convertirButtoncolpanel = new javax.swing.JButton();
        bordesRedondeados53 = new conversor.BordesRedondeados();
        jLabel44 = new javax.swing.JLabel();
        logoCOL1 = new javax.swing.JLabel();
        checkMEXcolpanel = new javax.swing.JCheckBox();
        checkUSDcolpanel = new javax.swing.JCheckBox();
        checkCRCcolpanel = new javax.swing.JCheckBox();
        checkEURcolpanel = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        mexpanel = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        bordesRedondeados54 = new conversor.BordesRedondeados();
        jLabel47 = new javax.swing.JLabel();
        USA4 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        bordesRedondeados55 = new conversor.BordesRedondeados();
        cantidadTextFieldmexpanel = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        cantidadCovertidaLabelmexpanel = new javax.swing.JLabel();
        bordesRedondeados56 = new conversor.BordesRedondeados();
        jLabel49 = new javax.swing.JLabel();
        logoMEX2 = new javax.swing.JLabel();
        bordesRedondeados57 = new conversor.BordesRedondeados();
        jLabel50 = new javax.swing.JLabel();
        EUR4 = new javax.swing.JLabel();
        bordesRedondeados58 = new conversor.BordesRedondeados();
        jLabel51 = new javax.swing.JLabel();
        logoMEX3 = new javax.swing.JLabel();
        bordesRedondeados59 = new conversor.BordesRedondeados();
        jLabel52 = new javax.swing.JLabel();
        COL4 = new javax.swing.JLabel();
        bordesRedondeados60 = new conversor.BordesRedondeados();
        jLabel53 = new javax.swing.JLabel();
        logoMEX4 = new javax.swing.JLabel();
        bordesRedondeados61 = new conversor.BordesRedondeados();
        jLabel54 = new javax.swing.JLabel();
        CRC4 = new javax.swing.JLabel();
        bordesRedondeados62 = new conversor.BordesRedondeados();
        convertirButtonmexpanel = new javax.swing.JButton();
        bordesRedondeados63 = new conversor.BordesRedondeados();
        jLabel55 = new javax.swing.JLabel();
        logoMEX1 = new javax.swing.JLabel();
        checkCRCmexpanel = new javax.swing.JCheckBox();
        checkUSDmexpanel = new javax.swing.JCheckBox();
        checkEURmexpanel = new javax.swing.JCheckBox();
        checkCOLmexpanel = new javax.swing.JCheckBox();
        jLabel56 = new javax.swing.JLabel();
        jPanel2Colors = new conversor.BordesRedondeados();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        R.setBackground(new java.awt.Color(204, 255, 204));
        R.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Colors.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1Colors.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("$$$$$$$$");
        jPanel1Colors.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        bordesRedondeados15.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados15.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados15.setRoundBottomLeft(20);
        bordesRedondeados15.setRoundBottomRight(20);
        bordesRedondeados15.setRoundTopLeft(20);
        bordesRedondeados15.setRoundTopRight(20);
        bordesRedondeados15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mexpanelButton.setBackground(new java.awt.Color(51, 51, 51));
        mexpanelButton.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        mexpanelButton.setForeground(new java.awt.Color(255, 255, 255));
        mexpanelButton.setText("MEX");
        mexpanelButton.setBorder(null);
        mexpanelButton.setBorderPainted(false);
        mexpanelButton.setContentAreaFilled(false);
        mexpanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mexpanelButton.setFocusPainted(false);
        mexpanelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mexpanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mexpanelButtonActionPerformed(evt);
            }
        });
        bordesRedondeados15.add(mexpanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 50));

        jPanel1Colors.add(bordesRedondeados15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 220, 40));

        bordesRedondeados16.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados16.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados16.setRoundBottomLeft(20);
        bordesRedondeados16.setRoundBottomRight(20);
        bordesRedondeados16.setRoundTopLeft(20);
        bordesRedondeados16.setRoundTopRight(20);
        bordesRedondeados16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usapanelButton.setBackground(new java.awt.Color(51, 51, 51));
        usapanelButton.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        usapanelButton.setForeground(new java.awt.Color(255, 255, 255));
        usapanelButton.setText("USD");
        usapanelButton.setBorder(null);
        usapanelButton.setBorderPainted(false);
        usapanelButton.setContentAreaFilled(false);
        usapanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usapanelButton.setFocusPainted(false);
        usapanelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usapanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usapanelButtonActionPerformed(evt);
            }
        });
        bordesRedondeados16.add(usapanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 50));

        jPanel1Colors.add(bordesRedondeados16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 220, 40));

        bordesRedondeados18.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados18.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados18.setRoundBottomLeft(20);
        bordesRedondeados18.setRoundBottomRight(20);
        bordesRedondeados18.setRoundTopLeft(20);
        bordesRedondeados18.setRoundTopRight(20);
        bordesRedondeados18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crcpanelButton.setBackground(new java.awt.Color(51, 51, 51));
        crcpanelButton.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        crcpanelButton.setForeground(new java.awt.Color(255, 255, 255));
        crcpanelButton.setText("CRC");
        crcpanelButton.setBorder(null);
        crcpanelButton.setBorderPainted(false);
        crcpanelButton.setContentAreaFilled(false);
        crcpanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crcpanelButton.setFocusPainted(false);
        crcpanelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crcpanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crcpanelButtonActionPerformed(evt);
            }
        });
        bordesRedondeados18.add(crcpanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 50));

        jPanel1Colors.add(bordesRedondeados18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 220, 40));

        bordesRedondeados20.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados20.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados20.setRoundBottomLeft(20);
        bordesRedondeados20.setRoundBottomRight(20);
        bordesRedondeados20.setRoundTopLeft(20);
        bordesRedondeados20.setRoundTopRight(20);
        bordesRedondeados20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eurpanelButton.setBackground(new java.awt.Color(51, 51, 51));
        eurpanelButton.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        eurpanelButton.setForeground(new java.awt.Color(255, 255, 255));
        eurpanelButton.setText("EUR");
        eurpanelButton.setBorder(null);
        eurpanelButton.setBorderPainted(false);
        eurpanelButton.setContentAreaFilled(false);
        eurpanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eurpanelButton.setFocusPainted(false);
        eurpanelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eurpanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eurpanelButtonActionPerformed(evt);
            }
        });
        bordesRedondeados20.add(eurpanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 50));

        jPanel1Colors.add(bordesRedondeados20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 220, 40));

        bordesRedondeados22.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados22.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados22.setRoundBottomLeft(20);
        bordesRedondeados22.setRoundBottomRight(20);
        bordesRedondeados22.setRoundTopLeft(20);
        bordesRedondeados22.setRoundTopRight(20);
        bordesRedondeados22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colpanelButton.setBackground(new java.awt.Color(51, 51, 51));
        colpanelButton.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        colpanelButton.setForeground(new java.awt.Color(255, 255, 255));
        colpanelButton.setText("COL");
        colpanelButton.setBorder(null);
        colpanelButton.setBorderPainted(false);
        colpanelButton.setContentAreaFilled(false);
        colpanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colpanelButton.setFocusPainted(false);
        colpanelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colpanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colpanelButtonActionPerformed(evt);
            }
        });
        bordesRedondeados22.add(colpanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 50));

        jPanel1Colors.add(bordesRedondeados22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 220, 40));

        jLabel57.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Conversor");
        jPanel1Colors.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        R.add(jPanel1Colors, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 830));

        usapanel.setBackground(new java.awt.Color(204, 255, 204));
        usapanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Conversor de Monedas");
        usapanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 490, -1));

        bordesRedondeados3.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados3.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados3.setRoundBottomLeft(20);
        bordesRedondeados3.setRoundBottomRight(20);
        bordesRedondeados3.setRoundTopLeft(20);
        bordesRedondeados3.setRoundTopRight(20);
        bordesRedondeados3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CRC");
        bordesRedondeados3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados3.add(CRC0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        usapanel.add(bordesRedondeados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 190, 50));

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad Convertida");
        usapanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        bordesRedondeados4.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados4.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados4.setRoundBottomLeft(20);
        bordesRedondeados4.setRoundBottomRight(20);
        bordesRedondeados4.setRoundTopLeft(20);
        bordesRedondeados4.setRoundTopRight(20);
        bordesRedondeados4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadTextField.setBackground(new java.awt.Color(51, 51, 51));
        cantidadTextField.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadTextField.setForeground(new java.awt.Color(255, 255, 255));
        cantidadTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadTextField.setBorder(null);
        bordesRedondeados4.add(cantidadTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 260, 50));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        bordesRedondeados4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 70));

        cantidadCovertidaLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadCovertidaLabel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadCovertidaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadCovertidaLabel.setText("0.00");
        bordesRedondeados4.add(cantidadCovertidaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, 50));

        usapanel.add(bordesRedondeados4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 590, 70));

        bordesRedondeados6.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados6.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados6.setRoundBottomLeft(20);
        bordesRedondeados6.setRoundBottomRight(20);
        bordesRedondeados6.setRoundTopLeft(20);
        bordesRedondeados6.setRoundTopRight(20);
        bordesRedondeados6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USD");
        bordesRedondeados6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados6.add(logoUSD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        usapanel.add(bordesRedondeados6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 190, 50));

        bordesRedondeados7.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados7.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados7.setRoundBottomLeft(20);
        bordesRedondeados7.setRoundBottomRight(20);
        bordesRedondeados7.setRoundTopLeft(20);
        bordesRedondeados7.setRoundTopRight(20);
        bordesRedondeados7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EUR");
        bordesRedondeados7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados7.add(EUR0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        usapanel.add(bordesRedondeados7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 190, 50));

        bordesRedondeados8.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados8.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados8.setRoundBottomLeft(20);
        bordesRedondeados8.setRoundBottomRight(20);
        bordesRedondeados8.setRoundTopLeft(20);
        bordesRedondeados8.setRoundTopRight(20);
        bordesRedondeados8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("USD");
        bordesRedondeados8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados8.add(logoUSD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        usapanel.add(bordesRedondeados8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 190, 50));

        bordesRedondeados9.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados9.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados9.setRoundBottomLeft(20);
        bordesRedondeados9.setRoundBottomRight(20);
        bordesRedondeados9.setRoundTopLeft(20);
        bordesRedondeados9.setRoundTopRight(20);
        bordesRedondeados9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("COL");
        bordesRedondeados9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados9.add(COL0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        usapanel.add(bordesRedondeados9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 190, 50));

        bordesRedondeados10.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados10.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados10.setRoundBottomLeft(20);
        bordesRedondeados10.setRoundBottomRight(20);
        bordesRedondeados10.setRoundTopLeft(20);
        bordesRedondeados10.setRoundTopRight(20);
        bordesRedondeados10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("USD");
        bordesRedondeados10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados10.add(logoUSD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        usapanel.add(bordesRedondeados10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 190, 50));

        bordesRedondeados11.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados11.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados11.setRoundBottomLeft(20);
        bordesRedondeados11.setRoundBottomRight(20);
        bordesRedondeados11.setRoundTopLeft(20);
        bordesRedondeados11.setRoundTopRight(20);
        bordesRedondeados11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MEX");
        bordesRedondeados11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados11.add(MEX0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        usapanel.add(bordesRedondeados11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 190, 50));

        bordesRedondeados13.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados13.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados13.setRoundBottomLeft(20);
        bordesRedondeados13.setRoundBottomRight(20);
        bordesRedondeados13.setRoundTopLeft(20);
        bordesRedondeados13.setRoundTopRight(20);
        bordesRedondeados13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        convertirButton.setBackground(new java.awt.Color(51, 51, 51));
        convertirButton.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        convertirButton.setForeground(new java.awt.Color(255, 255, 255));
        convertirButton.setText("Convertir");
        convertirButton.setBorder(null);
        convertirButton.setBorderPainted(false);
        convertirButton.setContentAreaFilled(false);
        convertirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertirButton.setFocusPainted(false);
        convertirButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        convertirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirButtonActionPerformed(evt);
            }
        });
        bordesRedondeados13.add(convertirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 50));

        usapanel.add(bordesRedondeados13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 590, 50));

        bordesRedondeados12.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados12.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados12.setRoundBottomLeft(20);
        bordesRedondeados12.setRoundBottomRight(20);
        bordesRedondeados12.setRoundTopLeft(20);
        bordesRedondeados12.setRoundTopRight(20);
        bordesRedondeados12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("USA");
        bordesRedondeados12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados12.add(logoUSD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        usapanel.add(bordesRedondeados12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 190, 50));

        checkMEX.setBackground(new java.awt.Color(204, 255, 204));
        checkMEX.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkMEX.setForeground(new java.awt.Color(51, 51, 51));
        checkMEX.setText("A");
        checkMEX.setBorder(null);
        checkMEX.setFocusPainted(false);
        usapanel.add(checkMEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        checkCRC.setBackground(new java.awt.Color(204, 255, 204));
        checkCRC.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkCRC.setForeground(new java.awt.Color(51, 51, 51));
        checkCRC.setText("A");
        checkCRC.setBorder(null);
        checkCRC.setFocusPainted(false);
        usapanel.add(checkCRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        checkEUR.setBackground(new java.awt.Color(204, 255, 204));
        checkEUR.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkEUR.setForeground(new java.awt.Color(51, 51, 51));
        checkEUR.setText("A");
        checkEUR.setBorder(null);
        checkEUR.setFocusPainted(false);
        usapanel.add(checkEUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        checkCOL.setBackground(new java.awt.Color(204, 255, 204));
        checkCOL.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkCOL.setForeground(new java.awt.Color(51, 51, 51));
        checkCOL.setText("A");
        checkCOL.setBorder(null);
        checkCOL.setFocusPainted(false);
        usapanel.add(checkCOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel5.setText("Ingrese la cantidad a convertir");
        usapanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        R.add(usapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 970, 830));

        eurpanel.setBackground(new java.awt.Color(204, 255, 204));
        eurpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Conversor de Monedas");
        eurpanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 490, -1));

        bordesRedondeados34.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados34.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados34.setRoundBottomLeft(20);
        bordesRedondeados34.setRoundBottomRight(20);
        bordesRedondeados34.setRoundTopLeft(20);
        bordesRedondeados34.setRoundTopRight(20);
        bordesRedondeados34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("USD");
        bordesRedondeados34.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados34.add(USA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        eurpanel.add(bordesRedondeados34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 190, 50));

        jLabel26.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel26.setText("Cantidad Convertida");
        eurpanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        bordesRedondeados35.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados35.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados35.setRoundBottomLeft(20);
        bordesRedondeados35.setRoundBottomRight(20);
        bordesRedondeados35.setRoundTopLeft(20);
        bordesRedondeados35.setRoundTopRight(20);
        bordesRedondeados35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadTextFieldeurpanel.setBackground(new java.awt.Color(51, 51, 51));
        cantidadTextFieldeurpanel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadTextFieldeurpanel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadTextFieldeurpanel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadTextFieldeurpanel.setBorder(null);
        bordesRedondeados35.add(cantidadTextFieldeurpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 260, 50));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        bordesRedondeados35.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 70));

        cantidadCovertidaLabeleurpanel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadCovertidaLabeleurpanel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadCovertidaLabeleurpanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadCovertidaLabeleurpanel.setText("0.00");
        bordesRedondeados35.add(cantidadCovertidaLabeleurpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, 50));

        eurpanel.add(bordesRedondeados35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 590, 70));

        bordesRedondeados36.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados36.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados36.setRoundBottomLeft(20);
        bordesRedondeados36.setRoundBottomRight(20);
        bordesRedondeados36.setRoundTopLeft(20);
        bordesRedondeados36.setRoundTopRight(20);
        bordesRedondeados36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("EUR");
        bordesRedondeados36.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados36.add(logoEUR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        eurpanel.add(bordesRedondeados36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 190, 50));

        bordesRedondeados37.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados37.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados37.setRoundBottomLeft(20);
        bordesRedondeados37.setRoundBottomRight(20);
        bordesRedondeados37.setRoundTopLeft(20);
        bordesRedondeados37.setRoundTopRight(20);
        bordesRedondeados37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("CRC");
        bordesRedondeados37.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados37.add(CRC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        eurpanel.add(bordesRedondeados37, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 190, 50));

        bordesRedondeados38.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados38.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados38.setRoundBottomLeft(20);
        bordesRedondeados38.setRoundBottomRight(20);
        bordesRedondeados38.setRoundTopLeft(20);
        bordesRedondeados38.setRoundTopRight(20);
        bordesRedondeados38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("EUR");
        bordesRedondeados38.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados38.add(logoEUR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        eurpanel.add(bordesRedondeados38, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 190, 50));

        bordesRedondeados39.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados39.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados39.setRoundBottomLeft(20);
        bordesRedondeados39.setRoundBottomRight(20);
        bordesRedondeados39.setRoundTopLeft(20);
        bordesRedondeados39.setRoundTopRight(20);
        bordesRedondeados39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("COL");
        bordesRedondeados39.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados39.add(COL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        eurpanel.add(bordesRedondeados39, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 190, 50));

        bordesRedondeados40.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados40.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados40.setRoundBottomLeft(20);
        bordesRedondeados40.setRoundBottomRight(20);
        bordesRedondeados40.setRoundTopLeft(20);
        bordesRedondeados40.setRoundTopRight(20);
        bordesRedondeados40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("EUR");
        bordesRedondeados40.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados40.add(logoEUR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        eurpanel.add(bordesRedondeados40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 190, 50));

        bordesRedondeados41.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados41.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados41.setRoundBottomLeft(20);
        bordesRedondeados41.setRoundBottomRight(20);
        bordesRedondeados41.setRoundTopLeft(20);
        bordesRedondeados41.setRoundTopRight(20);
        bordesRedondeados41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("MEX");
        bordesRedondeados41.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados41.add(MEX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        eurpanel.add(bordesRedondeados41, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 190, 50));

        bordesRedondeados42.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados42.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados42.setRoundBottomLeft(20);
        bordesRedondeados42.setRoundBottomRight(20);
        bordesRedondeados42.setRoundTopLeft(20);
        bordesRedondeados42.setRoundTopRight(20);
        bordesRedondeados42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        convertirButtoneurpanel.setBackground(new java.awt.Color(51, 51, 51));
        convertirButtoneurpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        convertirButtoneurpanel.setForeground(new java.awt.Color(255, 255, 255));
        convertirButtoneurpanel.setText("Convertir");
        convertirButtoneurpanel.setBorder(null);
        convertirButtoneurpanel.setBorderPainted(false);
        convertirButtoneurpanel.setContentAreaFilled(false);
        convertirButtoneurpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertirButtoneurpanel.setFocusPainted(false);
        convertirButtoneurpanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        convertirButtoneurpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirButtoneurpanelActionPerformed(evt);
            }
        });
        bordesRedondeados42.add(convertirButtoneurpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 50));

        eurpanel.add(bordesRedondeados42, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 590, 50));

        bordesRedondeados43.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados43.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados43.setRoundBottomLeft(20);
        bordesRedondeados43.setRoundBottomRight(20);
        bordesRedondeados43.setRoundTopLeft(20);
        bordesRedondeados43.setRoundTopRight(20);
        bordesRedondeados43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("EUR");
        bordesRedondeados43.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados43.add(logoEUR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        eurpanel.add(bordesRedondeados43, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 190, 50));

        checkMEXeurpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkMEXeurpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkMEXeurpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkMEXeurpanel.setText("A");
        checkMEXeurpanel.setBorder(null);
        checkMEXeurpanel.setFocusPainted(false);
        eurpanel.add(checkMEXeurpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        checkUSDeurpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkUSDeurpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkUSDeurpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkUSDeurpanel.setText("A");
        checkUSDeurpanel.setBorder(null);
        checkUSDeurpanel.setFocusPainted(false);
        eurpanel.add(checkUSDeurpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        checkCRCeurpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkCRCeurpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkCRCeurpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkCRCeurpanel.setText("A");
        checkCRCeurpanel.setBorder(null);
        checkCRCeurpanel.setFocusPainted(false);
        eurpanel.add(checkCRCeurpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        checkCOLeurpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkCOLeurpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkCOLeurpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkCOLeurpanel.setText("A");
        checkCOLeurpanel.setBorder(null);
        checkCOLeurpanel.setFocusPainted(false);
        eurpanel.add(checkCOLeurpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        jLabel34.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel34.setText("Ingrese la cantidad a convertir");
        eurpanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        R.add(eurpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 970, 830));

        crcpanel.setBackground(new java.awt.Color(204, 255, 204));
        crcpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Conversor de Monedas");
        crcpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 490, -1));

        bordesRedondeados24.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados24.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados24.setRoundBottomLeft(20);
        bordesRedondeados24.setRoundBottomRight(20);
        bordesRedondeados24.setRoundTopLeft(20);
        bordesRedondeados24.setRoundTopRight(20);
        bordesRedondeados24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("USD");
        bordesRedondeados24.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados24.add(USA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        crcpanel.add(bordesRedondeados24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 190, 50));

        jLabel11.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel11.setText("Cantidad Convertida");
        crcpanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        bordesRedondeados25.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados25.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados25.setRoundBottomLeft(20);
        bordesRedondeados25.setRoundBottomRight(20);
        bordesRedondeados25.setRoundTopLeft(20);
        bordesRedondeados25.setRoundTopRight(20);
        bordesRedondeados25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadTextFieldcrcpanel.setBackground(new java.awt.Color(51, 51, 51));
        cantidadTextFieldcrcpanel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadTextFieldcrcpanel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadTextFieldcrcpanel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadTextFieldcrcpanel.setBorder(null);
        bordesRedondeados25.add(cantidadTextFieldcrcpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 260, 50));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        bordesRedondeados25.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 70));

        cantidadCovertidaLabelcrcpanel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadCovertidaLabelcrcpanel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadCovertidaLabelcrcpanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadCovertidaLabelcrcpanel.setText("0.00");
        bordesRedondeados25.add(cantidadCovertidaLabelcrcpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, 50));

        crcpanel.add(bordesRedondeados25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 590, 70));

        bordesRedondeados26.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados26.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados26.setRoundBottomLeft(20);
        bordesRedondeados26.setRoundBottomRight(20);
        bordesRedondeados26.setRoundTopLeft(20);
        bordesRedondeados26.setRoundTopRight(20);
        bordesRedondeados26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CRC");
        bordesRedondeados26.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados26.add(logoCRC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        crcpanel.add(bordesRedondeados26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 190, 50));

        bordesRedondeados27.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados27.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados27.setRoundBottomLeft(20);
        bordesRedondeados27.setRoundBottomRight(20);
        bordesRedondeados27.setRoundTopLeft(20);
        bordesRedondeados27.setRoundTopRight(20);
        bordesRedondeados27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("EUR");
        bordesRedondeados27.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados27.add(EUR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        crcpanel.add(bordesRedondeados27, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 190, 50));

        bordesRedondeados28.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados28.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados28.setRoundBottomLeft(20);
        bordesRedondeados28.setRoundBottomRight(20);
        bordesRedondeados28.setRoundTopLeft(20);
        bordesRedondeados28.setRoundTopRight(20);
        bordesRedondeados28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("CRC");
        bordesRedondeados28.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados28.add(logoCRC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        crcpanel.add(bordesRedondeados28, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 190, 50));

        bordesRedondeados29.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados29.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados29.setRoundBottomLeft(20);
        bordesRedondeados29.setRoundBottomRight(20);
        bordesRedondeados29.setRoundTopLeft(20);
        bordesRedondeados29.setRoundTopRight(20);
        bordesRedondeados29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("COL");
        bordesRedondeados29.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados29.add(COL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        crcpanel.add(bordesRedondeados29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 190, 50));

        bordesRedondeados30.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados30.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados30.setRoundBottomLeft(20);
        bordesRedondeados30.setRoundBottomRight(20);
        bordesRedondeados30.setRoundTopLeft(20);
        bordesRedondeados30.setRoundTopRight(20);
        bordesRedondeados30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CRC");
        bordesRedondeados30.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados30.add(logoCRC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        crcpanel.add(bordesRedondeados30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 190, 50));

        bordesRedondeados31.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados31.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados31.setRoundBottomLeft(20);
        bordesRedondeados31.setRoundBottomRight(20);
        bordesRedondeados31.setRoundTopLeft(20);
        bordesRedondeados31.setRoundTopRight(20);
        bordesRedondeados31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("MEX");
        bordesRedondeados31.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados31.add(MEX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        crcpanel.add(bordesRedondeados31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 190, 50));

        bordesRedondeados32.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados32.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados32.setRoundBottomLeft(20);
        bordesRedondeados32.setRoundBottomRight(20);
        bordesRedondeados32.setRoundTopLeft(20);
        bordesRedondeados32.setRoundTopRight(20);
        bordesRedondeados32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        convertirButtoncrcpanel.setBackground(new java.awt.Color(51, 51, 51));
        convertirButtoncrcpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        convertirButtoncrcpanel.setForeground(new java.awt.Color(255, 255, 255));
        convertirButtoncrcpanel.setText("Convertir");
        convertirButtoncrcpanel.setBorder(null);
        convertirButtoncrcpanel.setBorderPainted(false);
        convertirButtoncrcpanel.setContentAreaFilled(false);
        convertirButtoncrcpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertirButtoncrcpanel.setFocusPainted(false);
        convertirButtoncrcpanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        convertirButtoncrcpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirButtoncrcpanelActionPerformed(evt);
            }
        });
        bordesRedondeados32.add(convertirButtoncrcpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 50));

        crcpanel.add(bordesRedondeados32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 590, 50));

        bordesRedondeados33.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados33.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados33.setRoundBottomLeft(20);
        bordesRedondeados33.setRoundBottomRight(20);
        bordesRedondeados33.setRoundTopLeft(20);
        bordesRedondeados33.setRoundTopRight(20);
        bordesRedondeados33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("CRC");
        bordesRedondeados33.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados33.add(logoCRC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        crcpanel.add(bordesRedondeados33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 190, 50));

        checkMEXcrcpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkMEXcrcpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkMEXcrcpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkMEXcrcpanel.setText("A");
        checkMEXcrcpanel.setBorder(null);
        checkMEXcrcpanel.setFocusPainted(false);
        crcpanel.add(checkMEXcrcpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        checkUSDcrcpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkUSDcrcpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkUSDcrcpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkUSDcrcpanel.setText("A");
        checkUSDcrcpanel.setBorder(null);
        checkUSDcrcpanel.setFocusPainted(false);
        crcpanel.add(checkUSDcrcpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        checkEURcrcpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkEURcrcpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkEURcrcpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkEURcrcpanel.setText("A");
        checkEURcrcpanel.setBorder(null);
        checkEURcrcpanel.setFocusPainted(false);
        crcpanel.add(checkEURcrcpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        checkCOLcrcpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkCOLcrcpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkCOLcrcpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkCOLcrcpanel.setText("A");
        checkCOLcrcpanel.setBorder(null);
        checkCOLcrcpanel.setFocusPainted(false);
        crcpanel.add(checkCOLcrcpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        jLabel23.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel23.setText("Ingrese la cantidad a convertir");
        crcpanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        R.add(crcpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 970, 830));

        colpanel.setBackground(new java.awt.Color(204, 255, 204));
        colpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Conversor de Monedas");
        colpanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 490, -1));

        bordesRedondeados44.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados44.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados44.setRoundBottomLeft(20);
        bordesRedondeados44.setRoundBottomRight(20);
        bordesRedondeados44.setRoundTopLeft(20);
        bordesRedondeados44.setRoundTopRight(20);
        bordesRedondeados44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("USD");
        bordesRedondeados44.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados44.add(USA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        colpanel.add(bordesRedondeados44, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 190, 50));

        jLabel37.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel37.setText("Cantidad Convertida");
        colpanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        bordesRedondeados45.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados45.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados45.setRoundBottomLeft(20);
        bordesRedondeados45.setRoundBottomRight(20);
        bordesRedondeados45.setRoundTopLeft(20);
        bordesRedondeados45.setRoundTopRight(20);
        bordesRedondeados45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadTextFieldcolpanel.setBackground(new java.awt.Color(51, 51, 51));
        cantidadTextFieldcolpanel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadTextFieldcolpanel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadTextFieldcolpanel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadTextFieldcolpanel.setBorder(null);
        bordesRedondeados45.add(cantidadTextFieldcolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 260, 50));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        bordesRedondeados45.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 70));

        cantidadCovertidaLabelcolpanel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadCovertidaLabelcolpanel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadCovertidaLabelcolpanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadCovertidaLabelcolpanel.setText("0.00");
        bordesRedondeados45.add(cantidadCovertidaLabelcolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, 50));

        colpanel.add(bordesRedondeados45, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 590, 70));

        bordesRedondeados46.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados46.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados46.setRoundBottomLeft(20);
        bordesRedondeados46.setRoundBottomRight(20);
        bordesRedondeados46.setRoundTopLeft(20);
        bordesRedondeados46.setRoundTopRight(20);
        bordesRedondeados46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("COL");
        bordesRedondeados46.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados46.add(logoCOL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        colpanel.add(bordesRedondeados46, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 190, 50));

        bordesRedondeados47.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados47.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados47.setRoundBottomLeft(20);
        bordesRedondeados47.setRoundBottomRight(20);
        bordesRedondeados47.setRoundTopLeft(20);
        bordesRedondeados47.setRoundTopRight(20);
        bordesRedondeados47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("CRC");
        bordesRedondeados47.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados47.add(CRC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        colpanel.add(bordesRedondeados47, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 190, 50));

        bordesRedondeados48.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados48.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados48.setRoundBottomLeft(20);
        bordesRedondeados48.setRoundBottomRight(20);
        bordesRedondeados48.setRoundTopLeft(20);
        bordesRedondeados48.setRoundTopRight(20);
        bordesRedondeados48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("COL");
        bordesRedondeados48.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados48.add(logoCOL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        colpanel.add(bordesRedondeados48, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 190, 50));

        bordesRedondeados49.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados49.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados49.setRoundBottomLeft(20);
        bordesRedondeados49.setRoundBottomRight(20);
        bordesRedondeados49.setRoundTopLeft(20);
        bordesRedondeados49.setRoundTopRight(20);
        bordesRedondeados49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("EUR");
        bordesRedondeados49.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados49.add(EUR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        colpanel.add(bordesRedondeados49, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 190, 50));

        bordesRedondeados50.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados50.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados50.setRoundBottomLeft(20);
        bordesRedondeados50.setRoundBottomRight(20);
        bordesRedondeados50.setRoundTopLeft(20);
        bordesRedondeados50.setRoundTopRight(20);
        bordesRedondeados50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("COL");
        bordesRedondeados50.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados50.add(logoCOL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        colpanel.add(bordesRedondeados50, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 190, 50));

        bordesRedondeados51.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados51.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados51.setRoundBottomLeft(20);
        bordesRedondeados51.setRoundBottomRight(20);
        bordesRedondeados51.setRoundTopLeft(20);
        bordesRedondeados51.setRoundTopRight(20);
        bordesRedondeados51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("MEX");
        bordesRedondeados51.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados51.add(MEX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        colpanel.add(bordesRedondeados51, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 190, 50));

        bordesRedondeados52.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados52.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados52.setRoundBottomLeft(20);
        bordesRedondeados52.setRoundBottomRight(20);
        bordesRedondeados52.setRoundTopLeft(20);
        bordesRedondeados52.setRoundTopRight(20);
        bordesRedondeados52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        convertirButtoncolpanel.setBackground(new java.awt.Color(51, 51, 51));
        convertirButtoncolpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        convertirButtoncolpanel.setForeground(new java.awt.Color(255, 255, 255));
        convertirButtoncolpanel.setText("Convertir");
        convertirButtoncolpanel.setBorder(null);
        convertirButtoncolpanel.setBorderPainted(false);
        convertirButtoncolpanel.setContentAreaFilled(false);
        convertirButtoncolpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertirButtoncolpanel.setFocusPainted(false);
        convertirButtoncolpanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        convertirButtoncolpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirButtoncolpanelActionPerformed(evt);
            }
        });
        bordesRedondeados52.add(convertirButtoncolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 50));

        colpanel.add(bordesRedondeados52, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 590, 50));

        bordesRedondeados53.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados53.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados53.setRoundBottomLeft(20);
        bordesRedondeados53.setRoundBottomRight(20);
        bordesRedondeados53.setRoundTopLeft(20);
        bordesRedondeados53.setRoundTopRight(20);
        bordesRedondeados53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("COL");
        bordesRedondeados53.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados53.add(logoCOL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        colpanel.add(bordesRedondeados53, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 190, 50));

        checkMEXcolpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkMEXcolpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkMEXcolpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkMEXcolpanel.setText("A");
        checkMEXcolpanel.setBorder(null);
        checkMEXcolpanel.setFocusPainted(false);
        colpanel.add(checkMEXcolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        checkUSDcolpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkUSDcolpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkUSDcolpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkUSDcolpanel.setText("A");
        checkUSDcolpanel.setBorder(null);
        checkUSDcolpanel.setFocusPainted(false);
        colpanel.add(checkUSDcolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        checkCRCcolpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkCRCcolpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkCRCcolpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkCRCcolpanel.setText("A");
        checkCRCcolpanel.setBorder(null);
        checkCRCcolpanel.setFocusPainted(false);
        colpanel.add(checkCRCcolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        checkEURcolpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkEURcolpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkEURcolpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkEURcolpanel.setText("A");
        checkEURcolpanel.setBorder(null);
        checkEURcolpanel.setFocusPainted(false);
        colpanel.add(checkEURcolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        jLabel45.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel45.setText("Ingrese la cantidad a convertir");
        colpanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        R.add(colpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 970, 830));

        mexpanel.setBackground(new java.awt.Color(204, 255, 204));
        mexpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Conversor de Monedas");
        mexpanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 490, -1));

        bordesRedondeados54.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados54.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados54.setRoundBottomLeft(20);
        bordesRedondeados54.setRoundBottomRight(20);
        bordesRedondeados54.setRoundTopLeft(20);
        bordesRedondeados54.setRoundTopRight(20);
        bordesRedondeados54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("USD");
        bordesRedondeados54.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados54.add(USA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        mexpanel.add(bordesRedondeados54, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 190, 50));

        jLabel48.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel48.setText("Cantidad Convertida");
        mexpanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        bordesRedondeados55.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados55.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados55.setRoundBottomLeft(20);
        bordesRedondeados55.setRoundBottomRight(20);
        bordesRedondeados55.setRoundTopLeft(20);
        bordesRedondeados55.setRoundTopRight(20);
        bordesRedondeados55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cantidadTextFieldmexpanel.setBackground(new java.awt.Color(51, 51, 51));
        cantidadTextFieldmexpanel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadTextFieldmexpanel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadTextFieldmexpanel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadTextFieldmexpanel.setBorder(null);
        bordesRedondeados55.add(cantidadTextFieldmexpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 260, 50));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        bordesRedondeados55.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 70));

        cantidadCovertidaLabelmexpanel.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        cantidadCovertidaLabelmexpanel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadCovertidaLabelmexpanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadCovertidaLabelmexpanel.setText("0.00");
        bordesRedondeados55.add(cantidadCovertidaLabelmexpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, 50));

        mexpanel.add(bordesRedondeados55, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 590, 70));

        bordesRedondeados56.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados56.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados56.setRoundBottomLeft(20);
        bordesRedondeados56.setRoundBottomRight(20);
        bordesRedondeados56.setRoundTopLeft(20);
        bordesRedondeados56.setRoundTopRight(20);
        bordesRedondeados56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("MEX");
        bordesRedondeados56.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados56.add(logoMEX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        mexpanel.add(bordesRedondeados56, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 190, 50));

        bordesRedondeados57.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados57.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados57.setRoundBottomLeft(20);
        bordesRedondeados57.setRoundBottomRight(20);
        bordesRedondeados57.setRoundTopLeft(20);
        bordesRedondeados57.setRoundTopRight(20);
        bordesRedondeados57.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("EUR");
        bordesRedondeados57.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados57.add(EUR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        mexpanel.add(bordesRedondeados57, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 190, 50));

        bordesRedondeados58.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados58.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados58.setRoundBottomLeft(20);
        bordesRedondeados58.setRoundBottomRight(20);
        bordesRedondeados58.setRoundTopLeft(20);
        bordesRedondeados58.setRoundTopRight(20);
        bordesRedondeados58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("MEX");
        bordesRedondeados58.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados58.add(logoMEX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        mexpanel.add(bordesRedondeados58, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 190, 50));

        bordesRedondeados59.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados59.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados59.setRoundBottomLeft(20);
        bordesRedondeados59.setRoundBottomRight(20);
        bordesRedondeados59.setRoundTopLeft(20);
        bordesRedondeados59.setRoundTopRight(20);
        bordesRedondeados59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("COL");
        bordesRedondeados59.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados59.add(COL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        mexpanel.add(bordesRedondeados59, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 190, 50));

        bordesRedondeados60.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados60.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados60.setRoundBottomLeft(20);
        bordesRedondeados60.setRoundBottomRight(20);
        bordesRedondeados60.setRoundTopLeft(20);
        bordesRedondeados60.setRoundTopRight(20);
        bordesRedondeados60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("MEX");
        bordesRedondeados60.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados60.add(logoMEX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        mexpanel.add(bordesRedondeados60, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 190, 50));

        bordesRedondeados61.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados61.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados61.setRoundBottomLeft(20);
        bordesRedondeados61.setRoundBottomRight(20);
        bordesRedondeados61.setRoundTopLeft(20);
        bordesRedondeados61.setRoundTopRight(20);
        bordesRedondeados61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("CRC");
        bordesRedondeados61.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 40));
        bordesRedondeados61.add(CRC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        mexpanel.add(bordesRedondeados61, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 190, 50));

        bordesRedondeados62.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados62.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados62.setRoundBottomLeft(20);
        bordesRedondeados62.setRoundBottomRight(20);
        bordesRedondeados62.setRoundTopLeft(20);
        bordesRedondeados62.setRoundTopRight(20);
        bordesRedondeados62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        convertirButtonmexpanel.setBackground(new java.awt.Color(51, 51, 51));
        convertirButtonmexpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        convertirButtonmexpanel.setForeground(new java.awt.Color(255, 255, 255));
        convertirButtonmexpanel.setText("Convertir");
        convertirButtonmexpanel.setBorder(null);
        convertirButtonmexpanel.setBorderPainted(false);
        convertirButtonmexpanel.setContentAreaFilled(false);
        convertirButtonmexpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertirButtonmexpanel.setFocusPainted(false);
        convertirButtonmexpanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        convertirButtonmexpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirButtonmexpanelActionPerformed(evt);
            }
        });
        bordesRedondeados62.add(convertirButtonmexpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 50));

        mexpanel.add(bordesRedondeados62, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 590, 50));

        bordesRedondeados63.setBackground(new java.awt.Color(51, 51, 51));
        bordesRedondeados63.setForeground(new java.awt.Color(255, 255, 255));
        bordesRedondeados63.setRoundBottomLeft(20);
        bordesRedondeados63.setRoundBottomRight(20);
        bordesRedondeados63.setRoundTopLeft(20);
        bordesRedondeados63.setRoundTopRight(20);
        bordesRedondeados63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("MEX");
        bordesRedondeados63.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));
        bordesRedondeados63.add(logoMEX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

        mexpanel.add(bordesRedondeados63, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 190, 50));

        checkCRCmexpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkCRCmexpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkCRCmexpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkCRCmexpanel.setText("A");
        checkCRCmexpanel.setBorder(null);
        checkCRCmexpanel.setFocusPainted(false);
        mexpanel.add(checkCRCmexpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        checkUSDmexpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkUSDmexpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkUSDmexpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkUSDmexpanel.setText("A");
        checkUSDmexpanel.setBorder(null);
        checkUSDmexpanel.setFocusPainted(false);
        mexpanel.add(checkUSDmexpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        checkEURmexpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkEURmexpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkEURmexpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkEURmexpanel.setText("A");
        checkEURmexpanel.setBorder(null);
        checkEURmexpanel.setFocusPainted(false);
        mexpanel.add(checkEURmexpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        checkCOLmexpanel.setBackground(new java.awt.Color(204, 255, 204));
        checkCOLmexpanel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkCOLmexpanel.setForeground(new java.awt.Color(51, 51, 51));
        checkCOLmexpanel.setText("A");
        checkCOLmexpanel.setBorder(null);
        checkCOLmexpanel.setFocusPainted(false);
        mexpanel.add(checkCOLmexpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        jLabel56.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel56.setText("Ingrese la cantidad a convertir");
        mexpanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        R.add(mexpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 970, 830));

        jPanel2Colors.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2Colors.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2Colors.setRoundBottomLeft(20);
        jPanel2Colors.setRoundBottomRight(20);
        jPanel2Colors.setRoundTopLeft(20);
        jPanel2Colors.setRoundTopRight(20);
        jPanel2Colors.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        R.add(jPanel2Colors, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 60, 830));

        getContentPane().add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirButtoneurpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirButtoneurpanelActionPerformed
        if(checkUSDeurpanel.isSelected()) {
            eurosAdolares();
        }
        if(checkCRCeurpanel.isSelected()) {
            eurosAcolones();
        }
        if(checkCOLeurpanel.isSelected()) {
            eurosApesosColombianos();
        }
        if(checkMEXeurpanel.isSelected()) {
            eurosApesosMexicanos();
        }
    }//GEN-LAST:event_convertirButtoneurpanelActionPerformed

    private void convertirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirButtonActionPerformed
        if(checkCRC.isSelected()) {
            dolaresAcolones();
        }
        if(checkEUR.isSelected()) {
            dolaresAeuros();
        }
        if(checkCOL.isSelected()) {
            dolaresApesosColombianos();
        }
        if(checkMEX.isSelected()) {
            dolaresApesosMexicanos();
        }
    }//GEN-LAST:event_convertirButtonActionPerformed

    private void convertirButtoncrcpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirButtoncrcpanelActionPerformed
        if(checkUSDcrcpanel.isSelected()) {
            colonesAdolares();
        }
        if(checkEURcrcpanel.isSelected()) {
            colonesAeuros();
        }
        if(checkCOLcrcpanel.isSelected()) {
            colonesApesosColombianos();
        }
        if(checkMEXcrcpanel.isSelected()) {
            colonesApesosMexicanos();
        }
    }//GEN-LAST:event_convertirButtoncrcpanelActionPerformed

    private void convertirButtoncolpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirButtoncolpanelActionPerformed
        if(checkUSDcolpanel.isSelected()) {
            pesosColombianosAdolares();
        }
        if(checkCRCcolpanel.isSelected()) {
            pesosColombianosAcolones();
        }
        if(checkEURcolpanel.isSelected()) {
            pesosColombianosAeuros();
        }
        if(checkMEXcolpanel.isSelected()) {
            pesosColombianosApesosMexicanos();
        }
    }//GEN-LAST:event_convertirButtoncolpanelActionPerformed

    private void convertirButtonmexpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirButtonmexpanelActionPerformed
        if(checkUSDmexpanel.isSelected()) {
            pesosMexicanosAdolares();
        }
        if(checkCRCmexpanel.isSelected()) {
            pesosMexicanosAcolones();
        }
        if(checkCOLmexpanel.isSelected()) {
            pesosMexicanosApesosColombianos();
        }
        if(checkEURmexpanel.isSelected()) {
            pesosMexicanosAeuros();
        }
    }//GEN-LAST:event_convertirButtonmexpanelActionPerformed

    private void mexpanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mexpanelButtonActionPerformed
        colpanel.setVisible(false);
        eurpanel.setVisible(false);
        crcpanel.setVisible(false);
        usapanel.setVisible(false);
        mexpanel.setVisible(true);
    }//GEN-LAST:event_mexpanelButtonActionPerformed

    private void crcpanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crcpanelButtonActionPerformed
        colpanel.setVisible(false);
        eurpanel.setVisible(false);
        usapanel.setVisible(false);
        mexpanel.setVisible(false);
        crcpanel.setVisible(true);
    }//GEN-LAST:event_crcpanelButtonActionPerformed

    private void colpanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colpanelButtonActionPerformed
        eurpanel.setVisible(false);
        usapanel.setVisible(false);
        crcpanel.setVisible(false);
        mexpanel.setVisible(false);
        colpanel.setVisible(true);
    }//GEN-LAST:event_colpanelButtonActionPerformed

    private void eurpanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eurpanelButtonActionPerformed
        colpanel.setVisible(false);
        crcpanel.setVisible(false);
        mexpanel.setVisible(false);
        usapanel.setVisible(false);
        eurpanel.setVisible(true);
    }//GEN-LAST:event_eurpanelButtonActionPerformed

    private void usapanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usapanelButtonActionPerformed
        colpanel.setVisible(false);
        eurpanel.setVisible(false);
        crcpanel.setVisible(false);
        mexpanel.setVisible(false);
        usapanel.setVisible(true);
    }//GEN-LAST:event_usapanelButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COL0;
    private javax.swing.JLabel COL1;
    private javax.swing.JLabel COL2;
    private javax.swing.JLabel COL4;
    private javax.swing.JLabel CRC0;
    private javax.swing.JLabel CRC2;
    private javax.swing.JLabel CRC3;
    private javax.swing.JLabel CRC4;
    private javax.swing.JLabel EUR0;
    private javax.swing.JLabel EUR1;
    private javax.swing.JLabel EUR3;
    private javax.swing.JLabel EUR4;
    private javax.swing.JLabel MEX0;
    private javax.swing.JLabel MEX1;
    private javax.swing.JLabel MEX2;
    private javax.swing.JLabel MEX3;
    private javax.swing.JPanel R;
    private javax.swing.JLabel USA1;
    private javax.swing.JLabel USA2;
    private javax.swing.JLabel USA3;
    private javax.swing.JLabel USA4;
    private conversor.BordesRedondeados bordesRedondeados10;
    private conversor.BordesRedondeados bordesRedondeados11;
    private conversor.BordesRedondeados bordesRedondeados12;
    private conversor.BordesRedondeados bordesRedondeados13;
    private conversor.BordesRedondeados bordesRedondeados15;
    private conversor.BordesRedondeados bordesRedondeados16;
    private conversor.BordesRedondeados bordesRedondeados18;
    private conversor.BordesRedondeados bordesRedondeados20;
    private conversor.BordesRedondeados bordesRedondeados22;
    private conversor.BordesRedondeados bordesRedondeados24;
    private conversor.BordesRedondeados bordesRedondeados25;
    private conversor.BordesRedondeados bordesRedondeados26;
    private conversor.BordesRedondeados bordesRedondeados27;
    private conversor.BordesRedondeados bordesRedondeados28;
    private conversor.BordesRedondeados bordesRedondeados29;
    private conversor.BordesRedondeados bordesRedondeados3;
    private conversor.BordesRedondeados bordesRedondeados30;
    private conversor.BordesRedondeados bordesRedondeados31;
    private conversor.BordesRedondeados bordesRedondeados32;
    private conversor.BordesRedondeados bordesRedondeados33;
    private conversor.BordesRedondeados bordesRedondeados34;
    private conversor.BordesRedondeados bordesRedondeados35;
    private conversor.BordesRedondeados bordesRedondeados36;
    private conversor.BordesRedondeados bordesRedondeados37;
    private conversor.BordesRedondeados bordesRedondeados38;
    private conversor.BordesRedondeados bordesRedondeados39;
    private conversor.BordesRedondeados bordesRedondeados4;
    private conversor.BordesRedondeados bordesRedondeados40;
    private conversor.BordesRedondeados bordesRedondeados41;
    private conversor.BordesRedondeados bordesRedondeados42;
    private conversor.BordesRedondeados bordesRedondeados43;
    private conversor.BordesRedondeados bordesRedondeados44;
    private conversor.BordesRedondeados bordesRedondeados45;
    private conversor.BordesRedondeados bordesRedondeados46;
    private conversor.BordesRedondeados bordesRedondeados47;
    private conversor.BordesRedondeados bordesRedondeados48;
    private conversor.BordesRedondeados bordesRedondeados49;
    private conversor.BordesRedondeados bordesRedondeados50;
    private conversor.BordesRedondeados bordesRedondeados51;
    private conversor.BordesRedondeados bordesRedondeados52;
    private conversor.BordesRedondeados bordesRedondeados53;
    private conversor.BordesRedondeados bordesRedondeados54;
    private conversor.BordesRedondeados bordesRedondeados55;
    private conversor.BordesRedondeados bordesRedondeados56;
    private conversor.BordesRedondeados bordesRedondeados57;
    private conversor.BordesRedondeados bordesRedondeados58;
    private conversor.BordesRedondeados bordesRedondeados59;
    private conversor.BordesRedondeados bordesRedondeados6;
    private conversor.BordesRedondeados bordesRedondeados60;
    private conversor.BordesRedondeados bordesRedondeados61;
    private conversor.BordesRedondeados bordesRedondeados62;
    private conversor.BordesRedondeados bordesRedondeados63;
    private conversor.BordesRedondeados bordesRedondeados7;
    private conversor.BordesRedondeados bordesRedondeados8;
    private conversor.BordesRedondeados bordesRedondeados9;
    private javax.swing.JLabel cantidadCovertidaLabel;
    private javax.swing.JLabel cantidadCovertidaLabelcolpanel;
    private javax.swing.JLabel cantidadCovertidaLabelcrcpanel;
    private javax.swing.JLabel cantidadCovertidaLabeleurpanel;
    private javax.swing.JLabel cantidadCovertidaLabelmexpanel;
    private javax.swing.JTextField cantidadTextField;
    private javax.swing.JTextField cantidadTextFieldcolpanel;
    private javax.swing.JTextField cantidadTextFieldcrcpanel;
    private javax.swing.JTextField cantidadTextFieldeurpanel;
    private javax.swing.JTextField cantidadTextFieldmexpanel;
    private javax.swing.JCheckBox checkCOL;
    private javax.swing.JCheckBox checkCOLcrcpanel;
    private javax.swing.JCheckBox checkCOLeurpanel;
    private javax.swing.JCheckBox checkCOLmexpanel;
    private javax.swing.JCheckBox checkCRC;
    private javax.swing.JCheckBox checkCRCcolpanel;
    private javax.swing.JCheckBox checkCRCeurpanel;
    private javax.swing.JCheckBox checkCRCmexpanel;
    private javax.swing.JCheckBox checkEUR;
    private javax.swing.JCheckBox checkEURcolpanel;
    private javax.swing.JCheckBox checkEURcrcpanel;
    private javax.swing.JCheckBox checkEURmexpanel;
    private javax.swing.JCheckBox checkMEX;
    private javax.swing.JCheckBox checkMEXcolpanel;
    private javax.swing.JCheckBox checkMEXcrcpanel;
    private javax.swing.JCheckBox checkMEXeurpanel;
    private javax.swing.JCheckBox checkUSDcolpanel;
    private javax.swing.JCheckBox checkUSDcrcpanel;
    private javax.swing.JCheckBox checkUSDeurpanel;
    private javax.swing.JCheckBox checkUSDmexpanel;
    private javax.swing.JPanel colpanel;
    private javax.swing.JButton colpanelButton;
    private javax.swing.JButton convertirButton;
    private javax.swing.JButton convertirButtoncolpanel;
    private javax.swing.JButton convertirButtoncrcpanel;
    private javax.swing.JButton convertirButtoneurpanel;
    private javax.swing.JButton convertirButtonmexpanel;
    private javax.swing.JPanel crcpanel;
    private javax.swing.JButton crcpanelButton;
    private javax.swing.JPanel eurpanel;
    private javax.swing.JButton eurpanelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1Colors;
    private conversor.BordesRedondeados jPanel2Colors;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel logoCOL1;
    private javax.swing.JLabel logoCOL2;
    private javax.swing.JLabel logoCOL3;
    private javax.swing.JLabel logoCOL4;
    private javax.swing.JLabel logoCRC1;
    private javax.swing.JLabel logoCRC2;
    private javax.swing.JLabel logoCRC3;
    private javax.swing.JLabel logoCRC4;
    private javax.swing.JLabel logoEUR1;
    private javax.swing.JLabel logoEUR2;
    private javax.swing.JLabel logoEUR3;
    private javax.swing.JLabel logoEUR4;
    private javax.swing.JLabel logoMEX1;
    private javax.swing.JLabel logoMEX2;
    private javax.swing.JLabel logoMEX3;
    private javax.swing.JLabel logoMEX4;
    private javax.swing.JLabel logoUSD1;
    private javax.swing.JLabel logoUSD2;
    private javax.swing.JLabel logoUSD3;
    private javax.swing.JLabel logoUSD4;
    private javax.swing.JPanel mexpanel;
    private javax.swing.JButton mexpanelButton;
    private javax.swing.JPanel usapanel;
    private javax.swing.JButton usapanelButton;
    // End of variables declaration//GEN-END:variables
}
