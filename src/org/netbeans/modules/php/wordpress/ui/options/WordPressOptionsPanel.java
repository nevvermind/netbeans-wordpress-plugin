/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2013 Sun Microsystems, Inc.
 */
package org.netbeans.modules.php.wordpress.ui.options;

import java.io.File;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.util.NbBundle;

final class WordPressOptionsPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = -4504251144555676048L;
    private static final String ZIP = ".zip"; // NOI18N
    private final WordPressOptionsPanelController controller;

    WordPressOptionsPanel(WordPressOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        downloadUrlLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        downloadUrlTextField = new javax.swing.JTextField();
        localFileTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(downloadUrlLabel, org.openide.util.NbBundle.getMessage(WordPressOptionsPanel.class, "WordPressOptionsPanel.downloadUrlLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(WordPressOptionsPanel.class, "WordPressOptionsPanel.jLabel1.text")); // NOI18N

        downloadUrlTextField.setText(org.openide.util.NbBundle.getMessage(WordPressOptionsPanel.class, "WordPressOptionsPanel.downloadUrlTextField.text")); // NOI18N

        localFileTextField.setText(org.openide.util.NbBundle.getMessage(WordPressOptionsPanel.class, "WordPressOptionsPanel.localFileTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(searchButton, org.openide.util.NbBundle.getMessage(WordPressOptionsPanel.class, "WordPressOptionsPanel.searchButton.text")); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(downloadUrlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localFileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(downloadUrlTextField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downloadUrlLabel)
                    .addComponent(downloadUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(localFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @NbBundle.Messages("LBL_LocalFilePath=Local file path")
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        File localFile = new FileChooserBuilder(WordPressOptionsPanel.class.getName())
                .setTitle(Bundle.LBL_LocalFilePath())
                .setFilesOnly(true)
                .showOpenDialog();
        if (localFile != null) {
            setLocalPath(localFile.getAbsolutePath());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    public void setLocalPath(String path) {
        localFileTextField.setText(path);
    }

    public void setUrl(String url) {
        downloadUrlTextField.setText(url);
    }

    private WordPressOptions getOptions() {
        return WordPressOptions.getInstance();
    }

    void load() {
        // TODO read settings and initialize GUI
        // Example:
        // someCheckBox.setSelected(Preferences.userNodeForPackage(WordPressOptionsPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(WordPressOptionsPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        setUrl(getOptions().getDownloadUrl());
        setLocalPath(getOptions().getLocalFilePath());
    }

    void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(WordPressOptionsPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(WordPressOptionsPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        String url = downloadUrlTextField.getText();
        String localFile = localFileTextField.getText();

        if (url != null) {
            String old = getOptions().getDownloadUrl();
            if (!old.equals(url)) {
                getOptions().setDownloadUrl(url);
            }
        }

        if (localFile != null && !localFile.isEmpty()) {
            String old = getOptions().getLocalFilePath();
            if (!old.equals(localFile) && localFile.endsWith(ZIP)) {
                getOptions().setLocalFilePath(localFile);
            }
            getOptions().setLocalFilePath(localFile);
        }

    }

    boolean valid() {
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel downloadUrlLabel;
    private javax.swing.JTextField downloadUrlTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField localFileTextField;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}