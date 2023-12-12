/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;
import javax.swing.GroupLayout.Alignment;

import com.raven.component.Item_People;
import com.raven.event.EventMenuLeft;
import com.raven.event.PublicEvent;
import com.raven.model.Model_User_Account;
import com.raven.swing.ScrollBar;

import net.miginfocom.swing.MigLayout;

import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JEditorPane;

/**
 *
 * @author RAVEN
 */
public class Menu_Right extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Left
     */
	 public Menu_Right() {
	        initComponents();
	        init();
	    }

	    private void init() {
	        sp.setVerticalScrollBar(new ScrollBar());
	        menuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
	        
	       
	          
	                if (menuMessage.isSelected()) {
	                    for (Component com : menuList.getComponents()) {
	                        Item_People item = (Item_People) com;
//	                        if (item.getUser().getUserID() == userID) {
//	                            item.updateStatus();
//	                            break;
//	                        }
	                    
	                
	                    }
//	        });
	        showMessage();
	        }
	    }

	    private void showMessage() {
	        //  test data
	        menuList.removeAll();
//	        for (Model_User_Account d : userAccount) {
//	            menuList.add(new Item_People(null), "wrap");
//	        }
	        refreshMenuList();
	    }

	    private void showGroup() {
	        //  test data
	        menuList.removeAll();
	        for (int i = 0; i < 5; i++) {
//	            menuList.add(new Item_People(null), "wrap");
	        }
	        refreshMenuList();
	    }

	  

	    private void refreshMenuList() {
	        menuList.repaint();
	        menuList.revalidate();
	    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        menu = new javax.swing.JLayeredPane();
	        menuMessage = new com.raven.component.MenuButton();
	        menuGroup = new com.raven.component.MenuButton();
	        menuBox = new com.raven.component.MenuButton();
	        sp = new javax.swing.JScrollPane();
	        menuList = new javax.swing.JLayeredPane();

	        setBackground(new java.awt.Color(242, 242, 242));

	        menu.setBackground(new java.awt.Color(229, 229, 229));
	        menu.setOpaque(true);
	        menu.setLayout(new java.awt.GridLayout(1, 3));
	        
	        menuMessage.setText("/n");
	        menuMessage.setText("Tạo cuộc trò chuyện");
	        menuMessage.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/message_selected.png"))); // NOI18N
	        menuMessage.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/message.png"))); // NOI18N
	        menuMessage.setSelected(true);
	        menuMessage.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                menuMessageActionPerformed(evt);
	            }
	        });
	        menu.add(menuMessage);

	        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/group.png"))); // NOI18N
	        menuGroup.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/group_selected.png"))); // NOI18N
	        menuGroup.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/group.png"))); // NOI18N
	        menuGroup.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                menuGroupActionPerformed(evt);
	            }
	        });
	        menu.add(menuGroup);

	      

	        sp.setBackground(new java.awt.Color(242, 242, 242));
	        sp.setBorder(null);
	        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

	        menuList.setBackground(new java.awt.Color(242, 242, 242));
	        menuList.setOpaque(true);

	        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
	        menuList.setLayout(menuListLayout);
	        menuListLayout.setHorizontalGroup(
	            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 0, Short.MAX_VALUE)
	        );
	        menuListLayout.setVerticalGroup(
	            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 576, Short.MAX_VALUE)
	        );

	        sp.setViewportView(menuList);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(sp)
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(sp)
	                .addContainerGap())
	        );
	    }// </editor-fold>//GEN-END:initComponents

	    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed
	        if (!menuMessage.isSelected()) {
	            menuMessage.setSelected(true);
	            menuGroup.setSelected(false);
	            
	            showMessage();
	        }
	    }//GEN-LAST:event_menuMessageActionPerformed

	    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
	        if (!menuGroup.isSelected()) {
	            menuMessage.setSelected(false);
	            menuGroup.setSelected(true);
	           
	            showGroup();
	        }
	    }//GEN-LAST:event_menuGroupActionPerformed


	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JLayeredPane menu;
	    private com.raven.component.MenuButton menuBox;
	    private com.raven.component.MenuButton menuGroup;
	    private javax.swing.JLayeredPane menuList;
	    private com.raven.component.MenuButton menuMessage;
	    private javax.swing.JScrollPane sp;
	    // End of variables declaration//GEN-END:variables
	}
