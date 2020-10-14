
package com.abugray.ui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.FILES_ONLY;
import javax.swing.JOptionPane;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        icon();
    }
    String clipBoard;
    

        
        
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Rendo1 = new javax.swing.JMenuItem();
        miRendo1 = new javax.swing.JMenuItem();
        sparator6 = new javax.swing.JPopupMenu.Separator();
        miCat1 = new javax.swing.JMenuItem();
        miCopy1 = new javax.swing.JMenuItem();
        miPaste1 = new javax.swing.JMenuItem();
        mPasteSpecial1 = new javax.swing.JMenu();
        miPasteFormHistory1 = new javax.swing.JMenuItem();
        miPasteAsColumn1 = new javax.swing.JMenuItem();
        miDelete1 = new javax.swing.JMenuItem();
        sparator8 = new javax.swing.JPopupMenu.Separator();
        miSelectAll1 = new javax.swing.JMenuItem();
        miChangetheselection1 = new javax.swing.JMenuItem();
        sparator9 = new javax.swing.JPopupMenu.Separator();
        mConvert1 = new javax.swing.JMenu();
        miToLowercase1 = new javax.swing.JMenuItem();
        miToUppercase1 = new javax.swing.JMenuItem();
        miToTitleCase1 = new javax.swing.JMenuItem();
        miToOppositeCase1 = new javax.swing.JMenuItem();
        sparator10 = new javax.swing.JPopupMenu.Separator();
        miTabstoSpaces1 = new javax.swing.JMenuItem();
        miSpacestoTabs1 = new javax.swing.JMenuItem();
        sparator11 = new javax.swing.JPopupMenu.Separator();
        miStripTrailingSpaces1 = new javax.swing.JMenuItem();
        miTranspose1 = new javax.swing.JMenuItem();
        mMoveSelection1 = new javax.swing.JMenu();
        miLineUp1 = new javax.swing.JMenuItem();
        miLineDown1 = new javax.swing.JMenuItem();
        mDuplicatLine1 = new javax.swing.JMenuItem();
        miIncreaseIndent1 = new javax.swing.JMenuItem();
        miDecreaseIndent1 = new javax.swing.JMenuItem();
        sparator12 = new javax.swing.JPopupMenu.Separator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTextHete = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        miNewWindows = new javax.swing.JMenuItem();
        mNewFormTamplate = new javax.swing.JMenu();
        miNoTemplateFileFoundinHere = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        miOpen = new javax.swing.JMenuItem();
        smOpenRecent = new javax.swing.JMenu();
        smiOpenRecent = new javax.swing.JMenuItem();
        separator5 = new javax.swing.JPopupMenu.Separator();
        smiClearHistory = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        miSave = new javax.swing.JMenuItem();
        miSaveAs = new javax.swing.JMenuItem();
        miSaveAll = new javax.swing.JMenuItem();
        miRevert = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        miPrint = new javax.swing.JMenuItem();
        separator3 = new javax.swing.JPopupMenu.Separator();
        miDetachTab = new javax.swing.JMenuItem();
        separator4 = new javax.swing.JPopupMenu.Separator();
        miCloseTab = new javax.swing.JMenuItem();
        miCloceWindows = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        Rendo = new javax.swing.JMenuItem();
        miRendo = new javax.swing.JMenuItem();
        sparator = new javax.swing.JPopupMenu.Separator();
        miCat = new javax.swing.JMenuItem();
        miCopy = new javax.swing.JMenuItem();
        miPaste = new javax.swing.JMenuItem();
        mPasteSpecial = new javax.swing.JMenu();
        miPasteFormHistory = new javax.swing.JMenuItem();
        miPasteAsColumn = new javax.swing.JMenuItem();
        miDelete = new javax.swing.JMenuItem();
        sparator1 = new javax.swing.JPopupMenu.Separator();
        miSelectAll = new javax.swing.JMenuItem();
        miChangetheselection = new javax.swing.JMenuItem();
        sparator2 = new javax.swing.JPopupMenu.Separator();
        mConvert = new javax.swing.JMenu();
        miToLowercase = new javax.swing.JMenuItem();
        miToUppercase = new javax.swing.JMenuItem();
        miToTitleCase = new javax.swing.JMenuItem();
        miToOppositeCase = new javax.swing.JMenuItem();
        sparator4 = new javax.swing.JPopupMenu.Separator();
        miTabstoSpaces = new javax.swing.JMenuItem();
        miSpacestoTabs = new javax.swing.JMenuItem();
        sparator5 = new javax.swing.JPopupMenu.Separator();
        miStripTrailingSpaces = new javax.swing.JMenuItem();
        miTranspose = new javax.swing.JMenuItem();
        mMoveSelection = new javax.swing.JMenu();
        miLineUp = new javax.swing.JMenuItem();
        miLineDown = new javax.swing.JMenuItem();
        mDuplicatLine = new javax.swing.JMenuItem();
        miIncreaseIndent = new javax.swing.JMenuItem();
        miDecreaseIndent = new javax.swing.JMenuItem();
        sparator3 = new javax.swing.JPopupMenu.Separator();
        miPreferences = new javax.swing.JMenuItem();
        menuSearch = new javax.swing.JMenu();
        miFind = new javax.swing.JMenuItem();
        miFindNext = new javax.swing.JMenuItem();
        miFindPrevious = new javax.swing.JMenuItem();
        miFindandReplace = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miGoto = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        miSelectFont = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mColorSceme = new javax.swing.JMenu();
        miDefault = new javax.swing.JMenuItem();
        miNone = new javax.swing.JMenuItem();
        miLight = new javax.swing.JMenuItem();
        miLineNumbers = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        miMenubar = new javax.swing.JMenuItem();
        miToolbar = new javax.swing.JMenuItem();
        miStatusbar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        miFullscreen = new javax.swing.JMenuItem();
        menuDocument = new javax.swing.JMenu();
        miWordWrap = new javax.swing.JMenuItem();
        miAutoIndent = new javax.swing.JMenuItem();
        mTabSize = new javax.swing.JMenu();
        mi2 = new javax.swing.JMenuItem();
        mi3 = new javax.swing.JMenuItem();
        mi4 = new javax.swing.JMenuItem();
        mi8 = new javax.swing.JMenuItem();
        miOther = new javax.swing.JMenuItem();
        miInsertSpaces = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mFileType = new javax.swing.JMenu();
        miPlainText = new javax.swing.JMenuItem();
        mMarkup = new javax.swing.JMenu();
        mOther = new javax.swing.JMenu();
        mScientific = new javax.swing.JMenu();
        mScript = new javax.swing.JMenu();
        mSource = new javax.swing.JMenu();
        mLineEnding = new javax.swing.JMenu();
        miUnix = new javax.swing.JMenuItem();
        miMac = new javax.swing.JMenuItem();
        miDos = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        miWriteUnicodeBOM = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        miPreviousTab = new javax.swing.JMenuItem();
        miNextTab = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuHelp = new javax.swing.JMenu();
        miContents = new javax.swing.JMenuItem();
        miAbout = new javax.swing.JMenuItem();

        Rendo1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Rendo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-redo-symbolic-rtl.symbolic.png"))); // NOI18N
        Rendo1.setText("Undo");
        popupMenu.add(Rendo1);

        miRendo1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        miRendo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-redo-symbolic.symbolic.png"))); // NOI18N
        miRendo1.setText("Rendo");
        popupMenu.add(miRendo1);
        popupMenu.add(sparator6);

        miCat1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        miCat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-cut-symbolic.symbolic.png"))); // NOI18N
        miCat1.setText("Cut");
        popupMenu.add(miCat1);

        miCopy1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miCopy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-copy-symbolic.symbolic.png"))); // NOI18N
        miCopy1.setText("Copy");
        popupMenu.add(miCopy1);

        miPaste1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        miPaste1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-paste-symbolic.symbolic.png"))); // NOI18N
        miPaste1.setMnemonic('p');
        miPaste1.setText("Paste");
        popupMenu.add(miPaste1);

        mPasteSpecial1.setMnemonic('s');
        mPasteSpecial1.setText("Paste Special");

        miPasteFormHistory1.setMnemonic('h');
        miPasteFormHistory1.setText("Paste Form History");
        mPasteSpecial1.add(miPasteFormHistory1);

        miPasteAsColumn1.setMnemonic('c');
        miPasteAsColumn1.setText("Paste As Column");
        mPasteSpecial1.add(miPasteAsColumn1);

        popupMenu.add(mPasteSpecial1);

        miDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-clear-all-symbolic.symbolic.png"))); // NOI18N
        miDelete1.setText("Delete");
        popupMenu.add(miDelete1);
        popupMenu.add(sparator8);

        miSelectAll1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-select-all-symbolic.symbolic.png"))); // NOI18N
        miSelectAll1.setMnemonic('a');
        miSelectAll1.setText("Select All");
        popupMenu.add(miSelectAll1);

        miChangetheselection1.setText("Change the selection");
        popupMenu.add(miChangetheselection1);
        popupMenu.add(sparator9);

        mConvert1.setMnemonic('r');
        mConvert1.setText("Convert");

        miToLowercase1.setMnemonic('l');
        miToLowercase1.setText("To Lowercase");
        mConvert1.add(miToLowercase1);

        miToUppercase1.setMnemonic('u');
        miToUppercase1.setText("To Uppercase");
        mConvert1.add(miToUppercase1);

        miToTitleCase1.setMnemonic('t');
        miToTitleCase1.setText("To Title Case");
        mConvert1.add(miToTitleCase1);

        miToOppositeCase1.setMnemonic('o');
        miToOppositeCase1.setText("To Opposite Case");
        mConvert1.add(miToOppositeCase1);
        mConvert1.add(sparator10);

        miTabstoSpaces1.setMnemonic('t');
        miTabstoSpaces1.setText("Tabs to Spaces");
        mConvert1.add(miTabstoSpaces1);

        miSpacestoTabs1.setMnemonic('s');
        miSpacestoTabs1.setText("Spaces to Tabs");
        mConvert1.add(miSpacestoTabs1);
        mConvert1.add(sparator11);

        miStripTrailingSpaces1.setMnemonic('r');
        miStripTrailingSpaces1.setText("Strip Trailing Spaces");
        mConvert1.add(miStripTrailingSpaces1);

        miTranspose1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        miTranspose1.setMnemonic('t');
        miTranspose1.setText("Transpose");
        mConvert1.add(miTranspose1);

        popupMenu.add(mConvert1);

        mMoveSelection1.setMnemonic('m');
        mMoveSelection1.setText("Move Selection");

        miLineUp1.setMnemonic('u');
        miLineUp1.setText("Line Up");
        mMoveSelection1.add(miLineUp1);

        miLineDown1.setMnemonic('d');
        miLineDown1.setText("Line Down");
        mMoveSelection1.add(miLineDown1);

        popupMenu.add(mMoveSelection1);

        mDuplicatLine1.setMnemonic('l');
        mDuplicatLine1.setText("Duplicat Line / Selection");
        popupMenu.add(mDuplicatLine1);

        miIncreaseIndent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/format-indent-less-symbolic-rtl.symbolic.png"))); // NOI18N
        miIncreaseIndent1.setMnemonic('i');
        miIncreaseIndent1.setText("Increase Indent");
        popupMenu.add(miIncreaseIndent1);

        miDecreaseIndent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/format-indent-less-symbolic.symbolic.png"))); // NOI18N
        miDecreaseIndent1.setMnemonic('d');
        miDecreaseIndent1.setText("Decrease Indent");
        popupMenu.add(miDecreaseIndent1);
        popupMenu.add(sparator12);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Simple Text Editor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        taTextHete.setColumns(20);
        taTextHete.setRows(5);
        taTextHete.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                taTextHeteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        taTextHete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taTextHeteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taTextHete);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        menuFile.setMnemonic('f');
        menuFile.setText("File");
        menuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileActionPerformed(evt);
            }
        });

        miNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        miNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/document-new-symbolic.symbolic.png"))); // NOI18N
        miNew.setMnemonic('n');
        miNew.setText("New");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewActionPerformed(evt);
            }
        });
        menuFile.add(miNew);

        miNewWindows.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miNewWindows.setMnemonic('w');
        miNewWindows.setText("New Windows");
        miNewWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewWindowsActionPerformed(evt);
            }
        });
        menuFile.add(miNewWindows);

        mNewFormTamplate.setMnemonic('m');
        mNewFormTamplate.setText("New From Template ");

        miNoTemplateFileFoundinHere.setText("No Template File Found in Here");
        mNewFormTamplate.add(miNoTemplateFileFoundinHere);

        menuFile.add(mNewFormTamplate);
        menuFile.add(separator);

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/document-open-symbolic.symbolic.png"))); // NOI18N
        miOpen.setMnemonic('o');
        miOpen.setText("Open...");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        menuFile.add(miOpen);

        smOpenRecent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/document-open-recent-symbolic.symbolic.png"))); // NOI18N
        smOpenRecent.setMnemonic('e');
        smOpenRecent.setText("Open Recent");

        smiOpenRecent.setText("No Item Found");
        smOpenRecent.add(smiOpenRecent);
        smOpenRecent.add(separator5);

        smiClearHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-clear-symbolic.symbolic.png"))); // NOI18N
        smiClearHistory.setText("Clear History");
        smOpenRecent.add(smiClearHistory);

        menuFile.add(smOpenRecent);
        menuFile.add(separator1);

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/document-save-symbolic.symbolic.png"))); // NOI18N
        miSave.setMnemonic('s');
        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        menuFile.add(miSave);

        miSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/document-save-as-symbolic.symbolic.png"))); // NOI18N
        miSaveAs.setMnemonic('a');
        miSaveAs.setText("Save As...");
        miSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(miSaveAs);

        miSaveAll.setMnemonic('l');
        miSaveAll.setText("Save All");
        menuFile.add(miSaveAll);

        miRevert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/document-revert-symbolic.symbolic.png"))); // NOI18N
        miRevert.setText("Revert");
        menuFile.add(miRevert);
        menuFile.add(separator2);

        miPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        miPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/document-print-symbolic.symbolic.png"))); // NOI18N
        miPrint.setMnemonic('p');
        miPrint.setText("Print");
        miPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPrintActionPerformed(evt);
            }
        });
        menuFile.add(miPrint);
        menuFile.add(separator3);

        miDetachTab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        miDetachTab.setText("Detach Tab");
        menuFile.add(miDetachTab);
        menuFile.add(separator4);

        miCloseTab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        miCloseTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-delete-symbolic.symbolic.png"))); // NOI18N
        miCloseTab.setMnemonic('t');
        miCloseTab.setText("Close Tab");
        miCloseTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCloseTabActionPerformed(evt);
            }
        });
        menuFile.add(miCloseTab);

        miCloceWindows.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        miCloceWindows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/application-exit-symbolic.symbolic.png"))); // NOI18N
        miCloceWindows.setMnemonic('c');
        miCloceWindows.setText("Close Windows");
        miCloceWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCloceWindowsActionPerformed(evt);
            }
        });
        menuFile.add(miCloceWindows);

        jMenuBar1.add(menuFile);

        menuEdit.setMnemonic('e');
        menuEdit.setText("Edit");

        Rendo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Rendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-redo-symbolic-rtl.symbolic.png"))); // NOI18N
        Rendo.setText("Undo");
        Rendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendoActionPerformed(evt);
            }
        });
        menuEdit.add(Rendo);

        miRendo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        miRendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-redo-symbolic.symbolic.png"))); // NOI18N
        miRendo.setText("Rendo");
        miRendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRendoActionPerformed(evt);
            }
        });
        menuEdit.add(miRendo);
        menuEdit.add(sparator);

        miCat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        miCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-cut-symbolic.symbolic.png"))); // NOI18N
        miCat.setText("Cut");
        miCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCatActionPerformed(evt);
            }
        });
        menuEdit.add(miCat);

        miCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-copy-symbolic.symbolic.png"))); // NOI18N
        miCopy.setText("Copy");
        miCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCopyActionPerformed(evt);
            }
        });
        menuEdit.add(miCopy);

        miPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        miPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-paste-symbolic.symbolic.png"))); // NOI18N
        miPaste.setMnemonic('p');
        miPaste.setText("Paste");
        miPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPasteActionPerformed(evt);
            }
        });
        menuEdit.add(miPaste);

        mPasteSpecial.setMnemonic('s');
        mPasteSpecial.setText("Paste Special");

        miPasteFormHistory.setMnemonic('h');
        miPasteFormHistory.setText("Paste Form History");
        mPasteSpecial.add(miPasteFormHistory);

        miPasteAsColumn.setMnemonic('c');
        miPasteAsColumn.setText("Paste As Column");
        mPasteSpecial.add(miPasteAsColumn);

        menuEdit.add(mPasteSpecial);

        miDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-clear-all-symbolic.symbolic.png"))); // NOI18N
        miDelete.setText("Delete");
        miDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeleteActionPerformed(evt);
            }
        });
        menuEdit.add(miDelete);
        menuEdit.add(sparator1);

        miSelectAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-select-all-symbolic.symbolic.png"))); // NOI18N
        miSelectAll.setMnemonic('a');
        miSelectAll.setText("Select All");
        miSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectAllActionPerformed(evt);
            }
        });
        menuEdit.add(miSelectAll);

        miChangetheselection.setText("Change the selection");
        menuEdit.add(miChangetheselection);
        menuEdit.add(sparator2);

        mConvert.setMnemonic('r');
        mConvert.setText("Convert");

        miToLowercase.setMnemonic('l');
        miToLowercase.setText("To Lowercase");
        miToLowercase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miToLowercaseActionPerformed(evt);
            }
        });
        mConvert.add(miToLowercase);

        miToUppercase.setMnemonic('u');
        miToUppercase.setText("To Uppercase");
        mConvert.add(miToUppercase);

        miToTitleCase.setMnemonic('t');
        miToTitleCase.setText("To Title Case");
        mConvert.add(miToTitleCase);

        miToOppositeCase.setMnemonic('o');
        miToOppositeCase.setText("To Opposite Case");
        mConvert.add(miToOppositeCase);
        mConvert.add(sparator4);

        miTabstoSpaces.setMnemonic('t');
        miTabstoSpaces.setText("Tabs to Spaces");
        mConvert.add(miTabstoSpaces);

        miSpacestoTabs.setMnemonic('s');
        miSpacestoTabs.setText("Spaces to Tabs");
        mConvert.add(miSpacestoTabs);
        mConvert.add(sparator5);

        miStripTrailingSpaces.setMnemonic('r');
        miStripTrailingSpaces.setText("Strip Trailing Spaces");
        mConvert.add(miStripTrailingSpaces);

        miTranspose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        miTranspose.setMnemonic('t');
        miTranspose.setText("Transpose");
        mConvert.add(miTranspose);

        menuEdit.add(mConvert);

        mMoveSelection.setMnemonic('m');
        mMoveSelection.setText("Move Selection");

        miLineUp.setMnemonic('u');
        miLineUp.setText("Line Up");
        mMoveSelection.add(miLineUp);

        miLineDown.setMnemonic('d');
        miLineDown.setText("Line Down");
        mMoveSelection.add(miLineDown);

        menuEdit.add(mMoveSelection);

        mDuplicatLine.setMnemonic('l');
        mDuplicatLine.setText("Duplicat Line / Selection");
        menuEdit.add(mDuplicatLine);

        miIncreaseIndent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/format-indent-less-symbolic-rtl.symbolic.png"))); // NOI18N
        miIncreaseIndent.setMnemonic('i');
        miIncreaseIndent.setText("Increase Indent");
        menuEdit.add(miIncreaseIndent);

        miDecreaseIndent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/format-indent-less-symbolic.symbolic.png"))); // NOI18N
        miDecreaseIndent.setMnemonic('d');
        miDecreaseIndent.setText("Decrease Indent");
        menuEdit.add(miDecreaseIndent);
        menuEdit.add(sparator3);

        miPreferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/view-preferences-symbolic.symbolic.png"))); // NOI18N
        miPreferences.setMnemonic('f');
        miPreferences.setText("Preferences");
        menuEdit.add(miPreferences);

        jMenuBar1.add(menuEdit);

        menuSearch.setMnemonic('s');
        menuSearch.setText("Search");

        miFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        miFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-find-symbolic.symbolic.png"))); // NOI18N
        miFind.setMnemonic('f');
        miFind.setText("Find");
        miFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFindActionPerformed(evt);
            }
        });
        menuSearch.add(miFind);

        miFindNext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        miFindNext.setMnemonic('n');
        miFindNext.setText("Find Next");
        menuSearch.add(miFindNext);

        miFindPrevious.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miFindPrevious.setMnemonic('p');
        miFindPrevious.setText("Find Previous");
        menuSearch.add(miFindPrevious);

        miFindandReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        miFindandReplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/edit-find-replace-symbolic.symbolic.png"))); // NOI18N
        miFindandReplace.setMnemonic('l');
        miFindandReplace.setText("Find and Rplace...");
        menuSearch.add(miFindandReplace);
        menuSearch.add(jSeparator1);

        miGoto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        miGoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/go-jump-symbolic.symbolic.png"))); // NOI18N
        miGoto.setMnemonic('g');
        miGoto.setText("Go to...");
        menuSearch.add(miGoto);

        jMenuBar1.add(menuSearch);

        menuView.setMnemonic('v');
        menuView.setText("View");

        miSelectFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/view-more-horizontal-symbolic.symbolic.png"))); // NOI18N
        miSelectFont.setMnemonic('o');
        miSelectFont.setText("Select Font...");
        menuView.add(miSelectFont);
        menuView.add(jSeparator2);

        mColorSceme.setMnemonic('c');
        mColorSceme.setText("Color Sceme");

        miDefault.setText("Default");
        mColorSceme.add(miDefault);

        miNone.setText("Drack");
        mColorSceme.add(miNone);

        miLight.setText("Light");
        mColorSceme.add(miLight);

        menuView.add(mColorSceme);

        miLineNumbers.setMnemonic('u');
        miLineNumbers.setText("Line Numbers");
        menuView.add(miLineNumbers);
        menuView.add(jSeparator3);

        miMenubar.setMnemonic('m');
        miMenubar.setText("Menubar");
        menuView.add(miMenubar);

        miToolbar.setMnemonic('t');
        miToolbar.setText("Toolbar");
        menuView.add(miToolbar);

        miStatusbar.setMnemonic('a');
        miStatusbar.setText("Statusbar");
        menuView.add(miStatusbar);
        menuView.add(jSeparator4);

        miFullscreen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        miFullscreen.setMnemonic('f');
        miFullscreen.setText("Fullscreen");
        menuView.add(miFullscreen);

        jMenuBar1.add(menuView);

        menuDocument.setMnemonic('d');
        menuDocument.setText("Document");

        miWordWrap.setMnemonic('w');
        miWordWrap.setText("Word Wrap");
        menuDocument.add(miWordWrap);

        miAutoIndent.setMnemonic('a');
        miAutoIndent.setText("Auto Indent");
        menuDocument.add(miAutoIndent);

        mTabSize.setMnemonic('s');
        mTabSize.setText("Tab Size");

        mi2.setText("2");
        mTabSize.add(mi2);

        mi3.setText("3");
        mTabSize.add(mi3);

        mi4.setText("4");
        mTabSize.add(mi4);

        mi8.setText("8");
        mTabSize.add(mi8);

        miOther.setText("Other...");
        mTabSize.add(miOther);

        miInsertSpaces.setText("Insert Spaces");
        mTabSize.add(miInsertSpaces);

        menuDocument.add(mTabSize);
        menuDocument.add(jSeparator5);

        mFileType.setMnemonic('f');
        mFileType.setText("File Type");

        miPlainText.setText("Plain Text");
        mFileType.add(miPlainText);

        mMarkup.setText("Markup");
        mFileType.add(mMarkup);

        mOther.setText("Other");
        mFileType.add(mOther);

        mScientific.setText("Scientific");
        mFileType.add(mScientific);

        mScript.setText("Script");
        mFileType.add(mScript);

        mSource.setText("Source");
        mFileType.add(mSource);

        menuDocument.add(mFileType);

        mLineEnding.setMnemonic('n');
        mLineEnding.setText("Line Lending");

        miUnix.setText("Uix (LF)");
        mLineEnding.add(miUnix);

        miMac.setText("Mac (CR)");
        mLineEnding.add(miMac);

        miDos.setText("DOS / Windws (CR LF)");
        mLineEnding.add(miDos);

        menuDocument.add(mLineEnding);
        menuDocument.add(jSeparator6);

        miWriteUnicodeBOM.setMnemonic('b');
        miWriteUnicodeBOM.setText("Write Unicode BOM");
        menuDocument.add(miWriteUnicodeBOM);
        menuDocument.add(jSeparator7);

        miPreviousTab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PAGE_UP, java.awt.event.InputEvent.CTRL_MASK));
        miPreviousTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/go-previous-symbolic.symbolic.png"))); // NOI18N
        miPreviousTab.setText("Previous Tab");
        menuDocument.add(miPreviousTab);

        miNextTab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PAGE_DOWN, java.awt.event.InputEvent.CTRL_MASK));
        miNextTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/go-previous-symbolic-rtl.symbolic.png"))); // NOI18N
        miNextTab.setText("Next Tab");
        menuDocument.add(miNextTab);
        menuDocument.add(jSeparator8);

        jMenuBar1.add(menuDocument);

        menuHelp.setMnemonic('h');
        menuHelp.setText("Help");

        miContents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miContents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/help-contents-symbolic.symbolic.png"))); // NOI18N
        miContents.setMnemonic('c');
        miContents.setText("Contents");
        menuHelp.add(miContents);

        miAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abugray/icon/preferences-system-details-symbolic.symbolic.png"))); // NOI18N
        miAbout.setMnemonic('a');
        miAbout.setText("About");
        menuHelp.add(miAbout);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(657, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void taTextHeteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taTextHeteMouseClicked
        if(evt.getButton()==MouseEvent.BUTTON3){
            popupMenu.show((Component)evt.getSource(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_taTextHeteMouseClicked

    private void miNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewActionPerformed
        if(taTextHete.getText().isEmpty()== false){
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes ?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(response == JOptionPane.NO_OPTION){
                taTextHete.setText("");
            } else if(response == JOptionPane.YES_OPTION){
                miSaveActionPerformed(evt);
                taTextHete.setText("");
            } else if(response == JOptionPane.CANCEL_OPTION){
                
            }
        }
    }//GEN-LAST:event_miNewActionPerformed

    private void miNewWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewWindowsActionPerformed
        new Menu().setVisible(true);
    }//GEN-LAST:event_miNewWindowsActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        if(taTextHete.getText().isEmpty() == true ){
            
            try{
                JFileChooser fileChooser = new JFileChooser("user");
                fileChooser.setFileSelectionMode(FILES_ONLY);
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("txt", "txt"));
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("java", "java"));
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("c", "c"));
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("cpp", "cpp"));
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("php", "php"));
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("html", "html"));
                fileChooser.setAcceptAllFileFilterUsed(true);

                int re = fileChooser.showOpenDialog(this);

                if(re == JFileChooser.APPROVE_OPTION){
                    File openFile = fileChooser.getSelectedFile();
                    FileReader fr = new FileReader(openFile);
                    BufferedReader br = new BufferedReader(fr);

                    taTextHete.read(br, null);
                    String oldText = taTextHete.getText();
                    br.close();
                }
            }catch(HeadlessException | IOException e){

            } 
        } else{
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes ?","Confirmation",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(response == JOptionPane.NO_OPTION){
                taTextHete.setText("");
                miOpenActionPerformed(evt);
            } else if(response == JOptionPane.YES_OPTION){
                miSaveActionPerformed(evt);
                taTextHete.setText("");
                miOpenActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_miOpenActionPerformed

    private void menuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileActionPerformed
      
    }//GEN-LAST:event_menuFileActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser("user");
                
                fileChooser.setAcceptAllFileFilterUsed(true);

                int re = fileChooser.showSaveDialog(this);

                if(re == JFileChooser.APPROVE_OPTION){
                    File saveFile = fileChooser.getSelectedFile();
                    FileWriter fw = new FileWriter(saveFile);
                    fw.write(taTextHete.getText());
                    fw.flush();
                    fw.close();
                }
        }catch (IOException ex) {
        }           
    }//GEN-LAST:event_miSaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(taTextHete.getText().isEmpty() == false){
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes ?","My Notepad",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(response == JOptionPane.NO_OPTION){
                System.exit(0);
            } else if(response == JOptionPane.YES_OPTION){
            }    
        } else{
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void miCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCloseTabActionPerformed
        if(taTextHete.getText().isEmpty() == false){
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes ?","Confirmation",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(response == JOptionPane.NO_OPTION){
                this.dispose();
            }
            else if(response == JOptionPane.YES_OPTION){
                miSaveActionPerformed(evt);
            }
        }
        else{
            System.exit(0);
        }  
    }//GEN-LAST:event_miCloseTabActionPerformed

    private void miCloceWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCloceWindowsActionPerformed
        if(taTextHete.getText().isEmpty() == false){
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes ?","Confirmation",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(response == JOptionPane.NO_OPTION){
                System.exit(0);
            }
            else if(response == JOptionPane.YES_OPTION){
                miSaveActionPerformed(evt);
            }
        }
        else{
            System.exit(0);
        }  
    }//GEN-LAST:event_miCloceWindowsActionPerformed

    private void miDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeleteActionPerformed
        taTextHete.replaceRange("", taTextHete.getSelectionStart(), taTextHete.getSelectionEnd());
    }//GEN-LAST:event_miDeleteActionPerformed

    private void miCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCopyActionPerformed
        taTextHete.copy();
    }//GEN-LAST:event_miCopyActionPerformed
        
    private void miPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPasteActionPerformed
        taTextHete.paste();
    }//GEN-LAST:event_miPasteActionPerformed

    private void miSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveAsActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser("user");
                
                fileChooser.setAcceptAllFileFilterUsed(true);

                int re = fileChooser.showSaveDialog(this);

                if(re == JFileChooser.APPROVE_OPTION){
                    File saveFile = fileChooser.getSelectedFile();
                    FileWriter fw = new FileWriter(saveFile);
                    fw.write(taTextHete.getText());
                    fw.flush();
                    fw.close();
                }
        }catch (IOException ex) {
        }  
    }//GEN-LAST:event_miSaveAsActionPerformed

    private void miCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCatActionPerformed
        taTextHete.cut();
    }//GEN-LAST:event_miCatActionPerformed

    private void RendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendoActionPerformed
        try {
            UndoManager manager = new UndoManager();
        taTextHete.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                manager.addEdit(e.getEdit());
            }
        });
            manager.undo();
        } catch (CannotUndoException e) {
        }
    }//GEN-LAST:event_RendoActionPerformed

    private void taTextHeteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_taTextHeteAncestorAdded
        UndoManager manager = new UndoManager();
        taTextHete.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                manager.addEdit(e.getEdit());
            }
        });
    }//GEN-LAST:event_taTextHeteAncestorAdded

    private void miRendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRendoActionPerformed
        try {
            UndoManager manager = new UndoManager();
        taTextHete.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                manager.addEdit(e.getEdit());
            }
        });
            manager.redo();
        } catch (CannotUndoException e) {
        }
    }//GEN-LAST:event_miRendoActionPerformed

    private void miPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPrintActionPerformed
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName(" Print Component ");
        pj.setPrintable ((Graphics pg, PageFormat pf, int pageNum) -> {
            if (pageNum > 0){
                return Printable.NO_SUCH_PAGE;
            }
            Graphics2D g2 = (Graphics2D) pg;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            taTextHete.paint(g2);
            return Printable.PAGE_EXISTS;
        });
        if (pj.printDialog() == false)
            return;
        try {
            pj.print();
        } catch (java.awt.print.PrinterException e) {
        }
        
    }//GEN-LAST:event_miPrintActionPerformed

    private void miSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectAllActionPerformed
        taTextHete.selectAll();
    }//GEN-LAST:event_miSelectAllActionPerformed

    private void miFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFindActionPerformed
        taTextHete.findComponentAt(taTextHete.getSelectionStart(), taTextHete.getSelectionEnd());
        
    }//GEN-LAST:event_miFindActionPerformed

    private void miToLowercaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miToLowercaseActionPerformed
//        String replace, toLowerCase;
//        replace = taTextHete.select(taTextHete.getSelectionStart(), taTextHete.getSelectionEnd());
//        toLowerCase = replace.toLowerCase();
//        taTextHete.replaceRange( toLowerCase, taTextHete.getSelectionStart(), taTextHete.getSelectionEnd());
    }//GEN-LAST:event_miToLowercaseActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Rendo;
    private javax.swing.JMenuItem Rendo1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenu mColorSceme;
    private javax.swing.JMenu mConvert;
    private javax.swing.JMenu mConvert1;
    private javax.swing.JMenuItem mDuplicatLine;
    private javax.swing.JMenuItem mDuplicatLine1;
    private javax.swing.JMenu mFileType;
    private javax.swing.JMenu mLineEnding;
    private javax.swing.JMenu mMarkup;
    private javax.swing.JMenu mMoveSelection;
    private javax.swing.JMenu mMoveSelection1;
    private javax.swing.JMenu mNewFormTamplate;
    private javax.swing.JMenu mOther;
    private javax.swing.JMenu mPasteSpecial;
    private javax.swing.JMenu mPasteSpecial1;
    private javax.swing.JMenu mScientific;
    private javax.swing.JMenu mScript;
    private javax.swing.JMenu mSource;
    private javax.swing.JMenu mTabSize;
    private javax.swing.JMenu menuDocument;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuSearch;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem mi2;
    private javax.swing.JMenuItem mi3;
    private javax.swing.JMenuItem mi4;
    private javax.swing.JMenuItem mi8;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miAutoIndent;
    private javax.swing.JMenuItem miCat;
    private javax.swing.JMenuItem miCat1;
    private javax.swing.JMenuItem miChangetheselection;
    private javax.swing.JMenuItem miChangetheselection1;
    private javax.swing.JMenuItem miCloceWindows;
    private javax.swing.JMenuItem miCloseTab;
    private javax.swing.JMenuItem miContents;
    private javax.swing.JMenuItem miCopy;
    private javax.swing.JMenuItem miCopy1;
    private javax.swing.JMenuItem miDecreaseIndent;
    private javax.swing.JMenuItem miDecreaseIndent1;
    private javax.swing.JMenuItem miDefault;
    private javax.swing.JMenuItem miDelete;
    private javax.swing.JMenuItem miDelete1;
    private javax.swing.JMenuItem miDetachTab;
    private javax.swing.JMenuItem miDos;
    private javax.swing.JMenuItem miFind;
    private javax.swing.JMenuItem miFindNext;
    private javax.swing.JMenuItem miFindPrevious;
    private javax.swing.JMenuItem miFindandReplace;
    private javax.swing.JMenuItem miFullscreen;
    private javax.swing.JMenuItem miGoto;
    private javax.swing.JMenuItem miIncreaseIndent;
    private javax.swing.JMenuItem miIncreaseIndent1;
    private javax.swing.JMenuItem miInsertSpaces;
    private javax.swing.JMenuItem miLight;
    private javax.swing.JMenuItem miLineDown;
    private javax.swing.JMenuItem miLineDown1;
    private javax.swing.JMenuItem miLineNumbers;
    private javax.swing.JMenuItem miLineUp;
    private javax.swing.JMenuItem miLineUp1;
    private javax.swing.JMenuItem miMac;
    private javax.swing.JMenuItem miMenubar;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miNewWindows;
    private javax.swing.JMenuItem miNextTab;
    private javax.swing.JMenuItem miNoTemplateFileFoundinHere;
    private javax.swing.JMenuItem miNone;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miOther;
    private javax.swing.JMenuItem miPaste;
    private javax.swing.JMenuItem miPaste1;
    private javax.swing.JMenuItem miPasteAsColumn;
    private javax.swing.JMenuItem miPasteAsColumn1;
    private javax.swing.JMenuItem miPasteFormHistory;
    private javax.swing.JMenuItem miPasteFormHistory1;
    private javax.swing.JMenuItem miPlainText;
    private javax.swing.JMenuItem miPreferences;
    private javax.swing.JMenuItem miPreviousTab;
    private javax.swing.JMenuItem miPrint;
    private javax.swing.JMenuItem miRendo;
    private javax.swing.JMenuItem miRendo1;
    private javax.swing.JMenuItem miRevert;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSaveAll;
    private javax.swing.JMenuItem miSaveAs;
    private javax.swing.JMenuItem miSelectAll;
    private javax.swing.JMenuItem miSelectAll1;
    private javax.swing.JMenuItem miSelectFont;
    private javax.swing.JMenuItem miSpacestoTabs;
    private javax.swing.JMenuItem miSpacestoTabs1;
    private javax.swing.JMenuItem miStatusbar;
    private javax.swing.JMenuItem miStripTrailingSpaces;
    private javax.swing.JMenuItem miStripTrailingSpaces1;
    private javax.swing.JMenuItem miTabstoSpaces;
    private javax.swing.JMenuItem miTabstoSpaces1;
    private javax.swing.JMenuItem miToLowercase;
    private javax.swing.JMenuItem miToLowercase1;
    private javax.swing.JMenuItem miToOppositeCase;
    private javax.swing.JMenuItem miToOppositeCase1;
    private javax.swing.JMenuItem miToTitleCase;
    private javax.swing.JMenuItem miToTitleCase1;
    private javax.swing.JMenuItem miToUppercase;
    private javax.swing.JMenuItem miToUppercase1;
    private javax.swing.JMenuItem miToolbar;
    private javax.swing.JMenuItem miTranspose;
    private javax.swing.JMenuItem miTranspose1;
    private javax.swing.JMenuItem miUnix;
    private javax.swing.JMenuItem miWordWrap;
    private javax.swing.JMenuItem miWriteUnicodeBOM;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JPopupMenu.Separator separator;
    private javax.swing.JPopupMenu.Separator separator1;
    private javax.swing.JPopupMenu.Separator separator2;
    private javax.swing.JPopupMenu.Separator separator3;
    private javax.swing.JPopupMenu.Separator separator4;
    private javax.swing.JPopupMenu.Separator separator5;
    private javax.swing.JMenu smOpenRecent;
    private javax.swing.JMenuItem smiClearHistory;
    private javax.swing.JMenuItem smiOpenRecent;
    private javax.swing.JPopupMenu.Separator sparator;
    private javax.swing.JPopupMenu.Separator sparator1;
    private javax.swing.JPopupMenu.Separator sparator10;
    private javax.swing.JPopupMenu.Separator sparator11;
    private javax.swing.JPopupMenu.Separator sparator12;
    private javax.swing.JPopupMenu.Separator sparator2;
    private javax.swing.JPopupMenu.Separator sparator3;
    private javax.swing.JPopupMenu.Separator sparator4;
    private javax.swing.JPopupMenu.Separator sparator5;
    private javax.swing.JPopupMenu.Separator sparator6;
    private javax.swing.JPopupMenu.Separator sparator8;
    private javax.swing.JPopupMenu.Separator sparator9;
    private javax.swing.JTextArea taTextHete;
    // End of variables declaration//GEN-END:variables

    private void icon() {
        ImageIcon icon = new ImageIcon("src/com/abugray/icon/text-editor-symbolic.symbolic.png");
        setIconImage(icon.getImage());
    }
}
