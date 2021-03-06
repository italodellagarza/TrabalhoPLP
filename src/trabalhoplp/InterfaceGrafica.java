/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe Ramos Palmuti
 * Classe InterfaceGrafica (InterfaceGrafica.java)
 */
package trabalhoplp;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
/**
 * Classe para a Interface gráfica com o método principal main
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe Ramos Palmuti
 */
public class InterfaceGrafica extends javax.swing.JFrame {
    String[] listaGenerosComic = Comic.GENEROS_COMIC;
    String[] listaErasComic = Comic.ERAS_COMIC;
    String[] listaGenerosTirinha = Tirinha.GENEROS_TIRINHA;
    String[] listaGenerosManga = Manga.GENEROS_MANGA;
    String[] listaTipologiasManga = Manga.TIPOLOGIAS_MANGA;
    
    CadastroGibis controle = new CadastroGibis();
    /**
     * Construtor da classe principal.
     */
    public InterfaceGrafica() {
        initComponents();
    }

    /**
     * Método gerado automaticamente pelo Netbeans
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selTipoGibi = new javax.swing.ButtonGroup();
        selMostrarTipo = new javax.swing.ButtonGroup();
        menuPrincipal = new javax.swing.JTabbedPane();
        painelGravarEmArquivo = new javax.swing.JPanel();
        cmpNomeArqSaida = new javax.swing.JTextField();
        lbltxt = new javax.swing.JLabel();
        lblDadosBarra = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGravarArqSaida = new javax.swing.JToggleButton();
        painelCarregarDeArquivo = new javax.swing.JPanel();
        campoCarregarArquivo = new javax.swing.JTextField();
        bntEscolherArquivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCarregarArquivo = new javax.swing.JButton();
        painelListarGibis = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListarGibis = new javax.swing.JTable();
        btnMostrarSomenteMangas = new javax.swing.JRadioButton();
        btnMostrarSemTipo = new javax.swing.JRadioButton();
        btnMostrarSomenteTirinhas = new javax.swing.JRadioButton();
        btnMostrarSomenteComics = new javax.swing.JRadioButton();
        btnMostrarTodosGibis = new javax.swing.JRadioButton();
        painelListarEditoras = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarEditoras = new javax.swing.JTable();
        btnListarEditoras = new javax.swing.JButton();
        painelCadastrar = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        txtAno = new javax.swing.JLabel();
        campoAnoPublicacao = new javax.swing.JTextField();
        selManga = new javax.swing.JRadioButton();
        selTirinha = new javax.swing.JRadioButton();
        selComic = new javax.swing.JRadioButton();
        selOutro = new javax.swing.JRadioButton();
        lblAutor = new javax.swing.JLabel();
        caixaEditoras = new javax.swing.JComboBox<>();
        lblNumVolumes = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        caixaGenero = new javax.swing.JComboBox<>();
        lblNumPaginas = new javax.swing.JLabel();
        cmpNumPaginas = new javax.swing.JTextField();
        cmpNumVolumes = new javax.swing.JTextField();
        cmpVeiculoPrimeiraPublicacao = new javax.swing.JTextField();
        lblVeiculoPrimeiraPub = new javax.swing.JLabel();
        lblTipologia = new javax.swing.JLabel();
        caixaTipologia = new javax.swing.JComboBox<>();
        lblEra = new javax.swing.JLabel();
        cmpErasComic = new javax.swing.JComboBox<>();
        btnCadastrarGibi = new javax.swing.JToggleButton();
        msgCadastrarGibi = new javax.swing.JLabel();
        cmpNumQuadrinhos = new javax.swing.JTextField();
        lblNumQuadrinhos = new javax.swing.JLabel();
        painelAdicionar = new javax.swing.JPanel();
        bntInserirEditora = new javax.swing.JButton();
        lblNomeEditora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmpNomeEditora = new javax.swing.JTextField();
        cmpCidadeEditora = new javax.swing.JTextField();
        cmpTelEditora = new javax.swing.JTextField();
        msgInserirEditora = new javax.swing.JLabel();
        cmpPaisEditora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        painelBuscarExcluir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmpNomeBusca = new javax.swing.JTextField();
        idGibiEncontrado = new javax.swing.JLabel();
        nomeGibiEncontrado = new javax.swing.JLabel();
        editoraGibiEncontrado = new javax.swing.JLabel();
        anoGibiEncontrado = new javax.swing.JLabel();
        autorGibiEncontrado = new javax.swing.JLabel();
        btnBuscarProximo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        msgNenhumEncontrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Gibis");

        lbltxt.setText(".txt");

        lblDadosBarra.setText("dados/");

        jLabel8.setText("Nome do arquivo de saída:");

        btnGravarArqSaida.setText("Gravar Arquivo de Saída");
        btnGravarArqSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarArqSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelGravarEmArquivoLayout = new javax.swing.GroupLayout(painelGravarEmArquivo);
        painelGravarEmArquivo.setLayout(painelGravarEmArquivoLayout);
        painelGravarEmArquivoLayout.setHorizontalGroup(
            painelGravarEmArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGravarEmArquivoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(painelGravarEmArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGravarArqSaida)
                    .addComponent(jLabel8)
                    .addGroup(painelGravarEmArquivoLayout.createSequentialGroup()
                        .addComponent(lblDadosBarra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpNomeArqSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltxt)))
                .addContainerGap(462, Short.MAX_VALUE))
        );
        painelGravarEmArquivoLayout.setVerticalGroup(
            painelGravarEmArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGravarEmArquivoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelGravarEmArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltxt)
                    .addGroup(painelGravarEmArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmpNomeArqSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDadosBarra)))
                .addGap(87, 87, 87)
                .addComponent(btnGravarArqSaida)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        menuPrincipal.addTab("Gravar gibis em arquivo", painelGravarEmArquivo);

        bntEscolherArquivo.setText("Pesquisar...");
        bntEscolherArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEscolherArquivoActionPerformed(evt);
            }
        });

        jLabel1.setText("Escolha o caminho para o arquivo a ser aberto:");

        btnCarregarArquivo.setText("Carregar Arquivo");
        btnCarregarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCarregarDeArquivoLayout = new javax.swing.GroupLayout(painelCarregarDeArquivo);
        painelCarregarDeArquivo.setLayout(painelCarregarDeArquivoLayout);
        painelCarregarDeArquivoLayout.setHorizontalGroup(
            painelCarregarDeArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCarregarDeArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCarregarDeArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCarregarDeArquivoLayout.createSequentialGroup()
                        .addComponent(campoCarregarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntEscolherArquivo))
                    .addComponent(jLabel1)
                    .addComponent(btnCarregarArquivo))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        painelCarregarDeArquivoLayout.setVerticalGroup(
            painelCarregarDeArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCarregarDeArquivoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCarregarDeArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCarregarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEscolherArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCarregarArquivo)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        menuPrincipal.addTab("Carregar gibis de arquivo", painelCarregarDeArquivo);

        tblListarGibis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Editora", "Ano"
            }
        ));
        jScrollPane2.setViewportView(tblListarGibis);

        selMostrarTipo.add(btnMostrarSomenteMangas);
        btnMostrarSomenteMangas.setText("Mostrar somente mangás");
        btnMostrarSomenteMangas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSomenteMangasActionPerformed(evt);
            }
        });

        selMostrarTipo.add(btnMostrarSemTipo);
        btnMostrarSemTipo.setText("Mostrar gibis sem tipo");
        btnMostrarSemTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSemTipoActionPerformed(evt);
            }
        });

        selMostrarTipo.add(btnMostrarSomenteTirinhas);
        btnMostrarSomenteTirinhas.setText("Mostrar somente tirinhas");
        btnMostrarSomenteTirinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSomenteTirinhasActionPerformed(evt);
            }
        });

        selMostrarTipo.add(btnMostrarSomenteComics);
        btnMostrarSomenteComics.setText("Mostrar somente comics");
        btnMostrarSomenteComics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSomenteComicsActionPerformed(evt);
            }
        });

        selMostrarTipo.add(btnMostrarTodosGibis);
        btnMostrarTodosGibis.setText("Mostrar todos os gibis");
        btnMostrarTodosGibis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosGibisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelListarGibisLayout = new javax.swing.GroupLayout(painelListarGibis);
        painelListarGibis.setLayout(painelListarGibisLayout);
        painelListarGibisLayout.setHorizontalGroup(
            painelListarGibisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListarGibisLayout.createSequentialGroup()
                .addGroup(painelListarGibisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelListarGibisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(painelListarGibisLayout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addGroup(painelListarGibisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarSemTipo)
                            .addComponent(btnMostrarSomenteMangas)
                            .addComponent(btnMostrarTodosGibis))
                        .addGap(217, 217, 217)
                        .addGroup(painelListarGibisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarSomenteTirinhas)
                            .addComponent(btnMostrarSomenteComics))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelListarGibisLayout.setVerticalGroup(
            painelListarGibisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListarGibisLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelListarGibisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelListarGibisLayout.createSequentialGroup()
                        .addComponent(btnMostrarSemTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarSomenteMangas))
                    .addGroup(painelListarGibisLayout.createSequentialGroup()
                        .addComponent(btnMostrarSomenteTirinhas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarSomenteComics)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarTodosGibis)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        menuPrincipal.addTab("Listar gibis disponíveis", painelListarGibis);

        tblListarEditoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListarEditoras);

        btnListarEditoras.setText("Listar");
        btnListarEditoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEditorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelListarEditorasLayout = new javax.swing.GroupLayout(painelListarEditoras);
        painelListarEditoras.setLayout(painelListarEditorasLayout);
        painelListarEditorasLayout.setHorizontalGroup(
            painelListarEditorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListarEditorasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelListarEditorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelListarEditorasLayout.createSequentialGroup()
                        .addComponent(btnListarEditoras)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelListarEditorasLayout.setVerticalGroup(
            painelListarEditorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelListarEditorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListarEditoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        menuPrincipal.addTab("Listar editoras", painelListarEditoras);

        txtTitulo.setText("Título:");

        campoTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoTituloMouseClicked(evt);
            }
        });

        txtAutor.setText("Autor:");

        campoAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoAutorMouseClicked(evt);
            }
        });

        txtAno.setText("Ano de Publicação: ");

        campoAnoPublicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoAnoPublicacaoMouseClicked(evt);
            }
        });

        selTipoGibi.add(selManga);
        selManga.setText("Mangá");
        selManga.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selMangaItemStateChanged(evt);
            }
        });

        selTipoGibi.add(selTirinha);
        selTirinha.setText("Tirinha");
        selTirinha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selTirinhaItemStateChanged(evt);
            }
        });

        selTipoGibi.add(selComic);
        selComic.setText("Comic");
        selComic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selComicItemStateChanged(evt);
            }
        });

        selTipoGibi.add(selOutro);
        selOutro.setSelected(true);
        selOutro.setText("Outro");
        selOutro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selOutroItemStateChanged(evt);
            }
        });

        lblAutor.setText("Editora: ");

        caixaEditoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caixaEditorasMouseClicked(evt);
            }
        });

        lblNumVolumes.setText("Número de volumes:");
        lblNumVolumes.setEnabled(false);

        lblGenero.setText("Gênero:");
        lblGenero.setEnabled(false);

        caixaGenero.setEnabled(false);
        caixaGenero.setOpaque(false);
        caixaGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caixaGeneroMouseClicked(evt);
            }
        });

        lblNumPaginas.setText("Número de páginas:");
        lblNumPaginas.setEnabled(false);

        cmpNumPaginas.setEnabled(false);
        cmpNumPaginas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpNumPaginasMouseClicked(evt);
            }
        });

        cmpNumVolumes.setEnabled(false);
        cmpNumVolumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpNumVolumesMouseClicked(evt);
            }
        });

        cmpVeiculoPrimeiraPublicacao.setEnabled(false);
        cmpVeiculoPrimeiraPublicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpVeiculoPrimeiraPublicacaoMouseClicked(evt);
            }
        });

        lblVeiculoPrimeiraPub.setText("Veículo da primeira publicação:");
        lblVeiculoPrimeiraPub.setEnabled(false);

        lblTipologia.setText("Tipologia: ");
        lblTipologia.setEnabled(false);

        caixaTipologia.setModel(new javax.swing.DefaultComboBoxModel<>(listaTipologiasManga));
        caixaTipologia.setEnabled(false);
        caixaTipologia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caixaTipologiaMouseClicked(evt);
            }
        });

        lblEra.setText("Era:");
        lblEra.setEnabled(false);

        cmpErasComic.setModel(new DefaultComboBoxModel<>(listaErasComic));
        cmpErasComic.setEnabled(false);
        cmpErasComic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpErasComicMouseClicked(evt);
            }
        });

        btnCadastrarGibi.setText("Cadastrar gibi");
        btnCadastrarGibi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarGibiActionPerformed(evt);
            }
        });

        msgCadastrarGibi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msgCadastrarGibi.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cmpNumQuadrinhos.setEnabled(false);
        cmpNumQuadrinhos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpNumQuadrinhosMouseClicked(evt);
            }
        });

        lblNumQuadrinhos.setText("Número de Quadrinhos:");
        lblNumQuadrinhos.setEnabled(false);

        javax.swing.GroupLayout painelCadastrarLayout = new javax.swing.GroupLayout(painelCadastrar);
        painelCadastrar.setLayout(painelCadastrarLayout);
        painelCadastrarLayout.setHorizontalGroup(
            painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addComponent(txtAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoAnoPublicacao))
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caixaEditoras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblNumVolumes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpNumVolumes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblGenero)
                        .addGap(18, 18, 18)
                        .addComponent(caixaGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumPaginas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVeiculoPrimeiraPub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpVeiculoPrimeiraPublicacao)
                            .addComponent(cmpNumPaginas)))
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblTipologia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caixaTipologia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblEra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpErasComic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblNumQuadrinhos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpNumQuadrinhos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastrarLayout.createSequentialGroup()
                                .addComponent(txtTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastrarLayout.createSequentialGroup()
                                .addComponent(txtAutor)
                                .addGap(18, 18, 18)
                                .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastrarLayout.createSequentialGroup()
                                .addComponent(selManga)
                                .addGap(18, 18, 18)
                                .addComponent(selTirinha)
                                .addGap(18, 18, 18)
                                .addComponent(selComic)
                                .addGap(18, 18, 18)
                                .addComponent(selOutro)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarGibi, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(msgCadastrarGibi, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        painelCadastrarLayout.setVerticalGroup(
            painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutor)
                            .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAno)
                            .addComponent(campoAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAutor)
                            .addComponent(caixaEditoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumVolumes)
                            .addComponent(cmpNumVolumes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(caixaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumPaginas)
                            .addComponent(cmpNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVeiculoPrimeiraPub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpVeiculoPrimeiraPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipologia)
                            .addComponent(caixaTipologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEra)
                            .addComponent(cmpErasComic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpNumQuadrinhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumQuadrinhos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(msgCadastrarGibi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarGibi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selManga)
                    .addComponent(selTirinha)
                    .addComponent(selComic)
                    .addComponent(selOutro))
                .addGap(17, 17, 17))
        );

        menuPrincipal.addTab("Cadastrar", painelCadastrar);

        bntInserirEditora.setText("Inserir Editora");
        bntInserirEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntInserirEditoraActionPerformed(evt);
            }
        });

        lblNomeEditora.setText("Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("Telefone");

        cmpNomeEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpNomeEditoraMouseClicked(evt);
            }
        });

        cmpCidadeEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpCidadeEditoraMouseClicked(evt);
            }
        });

        cmpTelEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpTelEditoraMouseClicked(evt);
            }
        });

        cmpPaisEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpPaisEditoraMouseClicked(evt);
            }
        });

        jLabel4.setText("Cidade:");

        jLabel5.setText("Pais:");

        javax.swing.GroupLayout painelAdicionarLayout = new javax.swing.GroupLayout(painelAdicionar);
        painelAdicionar.setLayout(painelAdicionarLayout);
        painelAdicionarLayout.setHorizontalGroup(
            painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarLayout.createSequentialGroup()
                .addGroup(painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAdicionarLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntInserirEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addGroup(painelAdicionarLayout.createSequentialGroup()
                                    .addComponent(lblNomeEditora)
                                    .addGap(37, 37, 37)
                                    .addComponent(cmpNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(msgInserirEditora)
                                .addGroup(painelAdicionarLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(21, 21, 21)
                                    .addComponent(cmpTelEditora)))))
                    .addGroup(painelAdicionarLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelAdicionarLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addComponent(cmpPaisEditora))
                            .addGroup(painelAdicionarLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpCidadeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        painelAdicionarLayout.setVerticalGroup(
            painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAdicionarLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEditora)
                    .addComponent(cmpNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(cmpCidadeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpPaisEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(painelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmpTelEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(msgInserirEditora)
                .addGap(37, 37, 37)
                .addComponent(bntInserirEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        menuPrincipal.addTab("Adicionar Editoras", painelAdicionar);

        jLabel6.setText("Nome do Gibi a ser buscado:");

        idGibiEncontrado.setText("Id: ");

        nomeGibiEncontrado.setText("Nome:");

        editoraGibiEncontrado.setText("Editora: ");

        anoGibiEncontrado.setText("Ano de Publicação: ");

        autorGibiEncontrado.setText("Autor: ");

        btnBuscarProximo.setText("Buscar próximo");
        btnBuscarProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProximoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir esse gibi");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        msgNenhumEncontrado.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout painelBuscarExcluirLayout = new javax.swing.GroupLayout(painelBuscarExcluir);
        painelBuscarExcluir.setLayout(painelBuscarExcluirLayout);
        painelBuscarExcluirLayout.setHorizontalGroup(
            painelBuscarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarExcluirLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelBuscarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgNenhumEncontrado)
                    .addGroup(painelBuscarExcluirLayout.createSequentialGroup()
                        .addComponent(btnBuscarProximo)
                        .addGap(145, 145, 145)
                        .addComponent(btnExcluir))
                    .addComponent(autorGibiEncontrado)
                    .addComponent(anoGibiEncontrado)
                    .addComponent(editoraGibiEncontrado)
                    .addComponent(nomeGibiEncontrado)
                    .addComponent(idGibiEncontrado)
                    .addGroup(painelBuscarExcluirLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cmpNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        painelBuscarExcluirLayout.setVerticalGroup(
            painelBuscarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarExcluirLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(painelBuscarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmpNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(idGibiEncontrado)
                .addGap(18, 18, 18)
                .addComponent(nomeGibiEncontrado)
                .addGap(18, 18, 18)
                .addComponent(editoraGibiEncontrado)
                .addGap(18, 18, 18)
                .addComponent(anoGibiEncontrado)
                .addGap(18, 18, 18)
                .addComponent(autorGibiEncontrado)
                .addGap(51, 51, 51)
                .addGroup(painelBuscarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProximo)
                    .addComponent(btnExcluir))
                .addGap(51, 51, 51)
                .addComponent(msgNenhumEncontrado)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        menuPrincipal.addTab("Buscar e/ou Excluir Gibi", painelBuscarExcluir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de editora.
     * @param evt Evento do clique 
     */
    private void cmpPaisEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpPaisEditoraMouseClicked
        msgInserirEditora.setText("");
    }//GEN-LAST:event_cmpPaisEditoraMouseClicked
    
    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de editora.
     * @param evt Evento do clique 
     */
    private void cmpTelEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpTelEditoraMouseClicked
        msgInserirEditora.setText("");
    }//GEN-LAST:event_cmpTelEditoraMouseClicked
    
    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de editora.
     * @param evt Evento do clique 
     */
    private void cmpCidadeEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpCidadeEditoraMouseClicked
        msgInserirEditora.setText("");
    }//GEN-LAST:event_cmpCidadeEditoraMouseClicked
    
    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de editora.
     * @param evt Evento do clique 
     */
    private void cmpNomeEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpNomeEditoraMouseClicked
        msgInserirEditora.setText("");
    }//GEN-LAST:event_cmpNomeEditoraMouseClicked
    
    /**
     * Ação ao clicar no botão inserir editora. 
     * @param evt Evento do clique 
     */
    private void bntInserirEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntInserirEditoraActionPerformed
        if(cmpNomeEditora.getText().isEmpty() ||
            cmpCidadeEditora.getText().isEmpty() ||
            cmpPaisEditora.getText().isEmpty() ||
            cmpTelEditora.getText().isEmpty()) {
            msgInserirEditora.setText("Nenhum campo pode estar vazio.");
            msgInserirEditora.setForeground(Color.red);

        }
        else if(cmpTelEditora.getText().length() != 12 || !cmpTelEditora.getText().matches("[0-9]*")) {
            msgInserirEditora.setText("O telefone deve ter somente números e 12 digitos.");
            msgInserirEditora.setForeground(Color.red);
        }
        else {
            controle.adicionarEditora(cmpNomeEditora.getText(),
                new Endereco(cmpCidadeEditora.getText(), cmpPaisEditora.getText()),
                cmpTelEditora.getText());
            msgInserirEditora.setText("Inserido com Sucesso");
            msgInserirEditora.setForeground(Color.green);
            caixaEditoras.setModel(new DefaultComboBoxModel(controle.getListaNomeEditoras()));
        }
    }//GEN-LAST:event_bntInserirEditoraActionPerformed
    /**
     * Ação ao clicar no botão "Cadastrar Gibi".
     * @param evt Evento do clique 
     */
    private void btnCadastrarGibiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarGibiActionPerformed
        if (selManga.isSelected()) {
            if(campoTitulo.toString().isEmpty() ||
               caixaEditoras.getSelectedItem().toString().isEmpty() ||
               campoAnoPublicacao.getText().isEmpty() ||
               campoAutor.getText().isEmpty() ||
               cmpNumVolumes.getText().isEmpty()) {
                msgCadastrarGibi.setForeground(Color.red);
                msgCadastrarGibi.setText("ERRO: Nenhum campo pode estar vazio!");
            }
            else if(!cmpNumVolumes.getText().matches("[0-9]+") ||
                      !campoAnoPublicacao.getText().matches("[0-9]+")) {
                msgCadastrarGibi.setForeground(Color.red);
                msgCadastrarGibi.setText("<html>ERRO: Os seguintes campos devem ser "
                        + "numéricos!:\n"
                        + "<br> <br>* Número de volumes\n"
                        + "<br> <br>* Ano de publicação</html>");
            }
            else {
                controle.adicionarManga(
                    campoTitulo.getText(),
                    (String) caixaEditoras.getSelectedItem(),
                    Integer.parseInt(campoAnoPublicacao.getText()),
                    campoAutor.getText(),
                    (String) caixaGenero.getSelectedItem(),
                    Integer.parseInt(cmpNumVolumes.getText()),
                    caixaTipologia.getSelectedItem().toString()
                );
                msgCadastrarGibi.setForeground(Color.green);
                msgCadastrarGibi.setText("Cadastrado com Sucesso!");
            }
        }
        else if(selComic.isSelected()) {
            if(campoTitulo.getText().isEmpty() ||
               caixaEditoras.getSelectedItem().toString().isEmpty() ||
               campoAnoPublicacao.getText().isEmpty() ||
               campoAutor.getText().isEmpty() ||
               cmpNumPaginas.getText().isEmpty() ||
               cmpNumVolumes.getText().isEmpty()) {
                msgCadastrarGibi.setForeground(Color.red);
                msgCadastrarGibi.setText("ERRO: Nenhum campo pode estar vazio!"); 
            }
            else if(!cmpNumVolumes.getText().matches("[0-9]+") ||
                    !campoAnoPublicacao.getText().matches("[0-9]+") ||
                    !cmpNumPaginas.getText().matches("[0-9]+")) {
                msgCadastrarGibi.setForeground(Color.red);
                msgCadastrarGibi.setText("<html>ERRO: Os seguintes campos devem ser "
                        + "numéricos!:\n"
                        + "<br> <br>* Número de volumes\n"
                        + "<br> <br>* Ano de publicação\n"
                        + "<br> <br>* Número de Páginas</html>");
            }
            else {
                controle.adicionarComic(
                    campoTitulo.getText(),
                    (String) caixaEditoras.getSelectedItem(),
                    Integer.parseInt(campoAnoPublicacao.getText()),
                    campoAutor.getText(),
                    (String) caixaGenero.getSelectedItem(),
                    Integer.parseInt(cmpNumPaginas.getText()),
                    Integer.parseInt(cmpNumVolumes.getText()),
                    (String) cmpErasComic.getSelectedItem()
                );
                msgCadastrarGibi.setForeground(Color.green);
                msgCadastrarGibi.setText("Cadastrado com Sucesso!");
            }
        }
        else if(selTirinha.isSelected()) {
            if(campoTitulo.getText().isEmpty() ||
               caixaEditoras.getSelectedItem().toString().isEmpty() ||
               campoAnoPublicacao.getText().isEmpty() ||
               campoAutor.getText().isEmpty() ||
               cmpNumQuadrinhos.getText().isEmpty() ||
               cmpVeiculoPrimeiraPublicacao.getText().isEmpty()) {
                msgCadastrarGibi.setForeground(Color.red);
                msgCadastrarGibi.setText("ERRO: Nenhum campo pode estar vazio!"); 
            }
            else if(!campoAnoPublicacao.getText().matches("[0-9]+") ||
                    !cmpNumQuadrinhos.getText().matches("[0-9]+")) {
                msgCadastrarGibi.setForeground(Color.red);
                msgCadastrarGibi.setText("<html>ERRO: Os seguintes campos devem ser "
                        + "numéricos!:\n"
                        + "<br> <br>* Ano de publicação\n"
                        + "<br> <br>* Número de quadrinhos<;html>");
            }
            else {
                controle.adicionarTirinha(
                    campoTitulo.getText(),
                    (String) caixaEditoras.getSelectedItem(),
                    Integer.parseInt(campoAnoPublicacao.getText()),
                    campoAutor.getText(),
                    (String) caixaGenero.getSelectedItem(),
                    Integer.parseInt(cmpNumQuadrinhos.getText()),
                    cmpVeiculoPrimeiraPublicacao.getText()
                );
                msgCadastrarGibi.setForeground(Color.green);
                msgCadastrarGibi.setText("Cadastrado com Sucesso!");
            }
        }
        else { // Outro
            if(campoTitulo.getText().isEmpty() ||
               (caixaEditoras.getSelectedItem() == null) ||
               campoAnoPublicacao.getText().isEmpty() ||
               campoAutor.getText().isEmpty()) { 
                msgCadastrarGibi.setForeground(Color.red);
                msgCadastrarGibi.setText("ERRO: Nenhum campo pode estar vazio!");
            }
            else if(!campoAnoPublicacao.getText().matches("[0-9]+")) {
                msgCadastrarGibi.setForeground(Color.red);
                msgCadastrarGibi.setText("<html>ERRO: Os seguintes campos devem "
                        + "ser numéricos!:\n"
                        + "<br> <br>* Ano de publicação</html>");
            }
            else {
                controle.adicionarGibi(
                    campoTitulo.getText(),
                    (String) caixaEditoras.getSelectedItem(),
                    Integer.parseInt(campoAnoPublicacao.getText()),
                    campoAutor.getText()
                );
                msgCadastrarGibi.setForeground(Color.green);
                msgCadastrarGibi.setText("Cadastrado com Sucesso!");
            }
        }
    }//GEN-LAST:event_btnCadastrarGibiActionPerformed
    /**
     * Habilitar/ desabilitar campos conforme selecionado.
     * @param evt Evento de Item.
     */
    private void selOutroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selOutroItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            caixaGenero.setEnabled(false);
            lblNumPaginas.setEnabled(false);
            cmpNumPaginas.setEnabled(false);
            lblGenero.setEnabled(false);
            lblNumVolumes.setEnabled(false);
            cmpNumVolumes.setEnabled(false);

        } else {
            caixaGenero.setEnabled(true);
            lblGenero.setEnabled(true);
        }
    }//GEN-LAST:event_selOutroItemStateChanged
    /**
     * Habilitar/ desabilitar campos conforme selecionado.
     * @param evt Evento de Item.
     */
    private void selComicItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selComicItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            caixaGenero.setModel(new DefaultComboBoxModel<>(listaGenerosComic));
            lblNumVolumes.setEnabled(true);
            cmpNumVolumes.setEnabled(true);
            cmpErasComic.setEnabled(true);
            lblEra.setEnabled(true);
            lblNumPaginas.setEnabled(true);
            cmpNumPaginas.setEnabled(true);
        } else {
            cmpNumVolumes.setEnabled(false);
            cmpErasComic.setEnabled(false);
            lblEra.setEnabled(false);
        }
    }//GEN-LAST:event_selComicItemStateChanged
    /**
     * Habilitar/ desabilitar campos conforme selecionado.
     * @param evt Evento de Item.
     */
    private void selTirinhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selTirinhaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            caixaGenero.setModel(new DefaultComboBoxModel<String>(listaGenerosTirinha));
            lblVeiculoPrimeiraPub.setEnabled(true);
            cmpVeiculoPrimeiraPublicacao.setEnabled(true);
            cmpNumQuadrinhos.setEnabled(true);
            lblNumQuadrinhos.setEnabled(true);
            cmpNumPaginas.setEnabled(false);
            lblNumPaginas.setEnabled(false);
            lblNumVolumes.setEnabled(false);
            cmpNumVolumes.setEnabled(false);

        } else {
            lblVeiculoPrimeiraPub.setEnabled(false);
            cmpVeiculoPrimeiraPublicacao.setEnabled(false);
            cmpNumPaginas.setEnabled(true);
            lblNumPaginas.setEnabled(true);
            cmpNumQuadrinhos.setEnabled(false);
            lblNumQuadrinhos.setEnabled(false);
        }
    }//GEN-LAST:event_selTirinhaItemStateChanged
    
    /**
     * Habilitar/ desabilitar campos conforme selecionado.
     * @param evt Evento de Item.
     */
    private void selMangaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selMangaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            caixaGenero.setModel(new DefaultComboBoxModel<String>(listaGenerosManga));
            caixaTipologia.setEnabled(true);
            lblTipologia.setEnabled(true);
            lblNumPaginas.setEnabled(false);
            cmpNumPaginas.setEnabled(false);
            lblNumVolumes.setEnabled(true);
            cmpNumVolumes.setEnabled(true);
        } else {
            caixaTipologia.setEnabled(false);
            lblTipologia.setEnabled(false);
        }
    }//GEN-LAST:event_selMangaItemStateChanged
   
    /**
     * Ação do clique ao botão "Listar" em "Listar Editoras".
     * @param evt Evento do clique.
     */
    private void btnListarEditorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEditorasActionPerformed
        tblListarEditoras.setModel(new javax.swing.table.DefaultTableModel(controle.listarEditoras(), new String [] {
            "id", "Nome", "Endereço", "Telefone"
        }));
    }//GEN-LAST:event_btnListarEditorasActionPerformed
    
    /**
     * Ação do clique ao botão "Mostrar somente comics" em "Listar Gibis".
     * @param evt Evento do clique.
     */
    private void btnMostrarSomenteComicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSomenteComicsActionPerformed
        tblListarGibis.setModel(new javax.swing.table.DefaultTableModel(controle.listarComics(), new String [] {
            "id", "Nome", "Editora", "Ano de Plublicação", "Autor", "Genero"
            , "Número de Páginas", "Número de Volumes", "Era"
        }));
    }//GEN-LAST:event_btnMostrarSomenteComicsActionPerformed
    
    /**
     * Ação do clique ao botão "Mostrar somente tirinhas" em "Listar Gibis".
     * @param evt Evento do clique.
     */
    private void btnMostrarSomenteTirinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSomenteTirinhasActionPerformed
        tblListarGibis.setModel(new javax.swing.table.DefaultTableModel(controle.listarTirinha(), new String [] {
            "id", "Nome", "Editora", "Ano de Plublicação", "Autor", "Genero",
            "Número de Quadrinhos", "Veículo da primeira publicação"
        }));
    }//GEN-LAST:event_btnMostrarSomenteTirinhasActionPerformed
    /**
     * Ação do clique ao botão "Mostrar Gibis sem tipo" em "Listar Gibis".
     * @param evt Evento do clique.
     */
    private void btnMostrarSemTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSemTipoActionPerformed
        tblListarGibis.setModel(new javax.swing.table.DefaultTableModel(controle.listarGibis(), new String [] {
            "id", "Nome", "Editora", "Ano de Plublicação", "Autor"
        }));
    }//GEN-LAST:event_btnMostrarSemTipoActionPerformed
    
    /**
     * Ação do clique ao botão "Mostrar somente mangás" em "Listar Gibis".
     * @param evt Evento do clique.
     */
    private void btnMostrarSomenteMangasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSomenteMangasActionPerformed
        tblListarGibis.setModel(new javax.swing.table.DefaultTableModel(controle.listarMangas(), new String [] {
            "id", "Nome", "Editora", "Ano de Plublicação", "Autor", "Genero",
            "Número de Volumes", "Tipologia"
        }));
    }//GEN-LAST:event_btnMostrarSomenteMangasActionPerformed
    
    /**
     * Ação do botão de carregar gibis de arquivo.
     * @param evt Evento do clique.
     */
    private void btnCarregarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarArquivoActionPerformed
        try {
            controle.carregarGibisDeArquivo(campoCarregarArquivo.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCarregarArquivoActionPerformed
    
    /**
     * Ação do botão de escolher arquivo para carregar.
     * @param evt 
     */
    private void bntEscolherArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEscolherArquivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        File f = new File("dist/");
        chooser.setCurrentDirectory(f);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setDialogTitle("Escolha o arquivo que deseja abrir");
        chooser.showOpenDialog(null);
        campoCarregarArquivo.setText(chooser.getSelectedFile().getPath());
    }//GEN-LAST:event_bntEscolherArquivoActionPerformed
    
    // Essa variável auxiliar é usada para armazenar os gibis que foram pesquisados.
    private List<Gibi> anteriores = new ArrayList<Gibi>();
    
    /**
     * Ação do botão de buscar o próximo gibi na pesquisa.
     * @param evt Evento do clique.
     */
    private void btnBuscarProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProximoActionPerformed
        msgNenhumEncontrado.setText("");
        Gibi g;
        if(anteriores.isEmpty())
            g = controle.buscarGibi(cmpNomeBusca.getText());
        else {
            g = controle.buscarGibi(cmpNomeBusca.getText(), anteriores);
            if(cmpNomeBusca.getText().equals(anteriores.get(0).getNome())) {
                anteriores.clear();
                idGibiEncontrado.setText("Id: ");
                nomeGibiEncontrado.setText("Nome: ");
                anoGibiEncontrado.setText("Ano de Publicação: ");
                autorGibiEncontrado.setText("Autor: ");
            }
        }
        if(g != null){
            anteriores.add(g);
            idGibiEncontrado.setText("Id: " + Integer.toString(g.getId()));
            nomeGibiEncontrado.setText("Nome: " + g.getNome());
            anoGibiEncontrado.setText("Ano de Publicação: " + Integer
                    .toString(g.getAnoPublicacao()));
            autorGibiEncontrado.setText("Autor: " + g.getAutor());
            autorGibiEncontrado.setText("Editora: " + g.getEditora());
        } else {
            msgNenhumEncontrado.setText("Nenhum Encontrado");
        }
    }//GEN-LAST:event_btnBuscarProximoActionPerformed

    /**
     * Ação do botão de excluir gibi em "pesquisar".
     * @param evt Evento do clique.
     */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Gibi g = anteriores.get(anteriores.size() -1);
        if(g.getClass() == Manga.class) {
            Manga m = (Manga) g;
            controle.removerManga(m);
        }
        else if(g.getClass() == Tirinha.class) {
            Tirinha t = (Tirinha) g;
            controle.removerTirinha(t);
        }
        else if(g.getClass() == Comic.class) {
            Comic c = (Comic) g;
            controle.removerComic(c);
        }
        else {
            controle.removerGibi(g);
        }
        anteriores.remove(g);
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * Ação do botão de gravar arquivo de saída.
     * @param evt Evento do clique.
     */
    private void btnGravarArqSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarArqSaidaActionPerformed
        try {
            controle.gravarGibisEmArquivo("dados/" + cmpNomeArqSaida.getText()+ ".txt");
        } catch (IOException ex) {
            Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGravarArqSaidaActionPerformed

    /**
     * Ação do botão de rádio "Mostrar todos os gibis" em "Listar Gibis".
     * @param evt Evento do clique.
     */
    private void btnMostrarTodosGibisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosGibisActionPerformed
        tblListarGibis.setModel(new javax.swing.table.DefaultTableModel(controle.listarTodos(), new String [] {
            "id", "Nome", "Editora", "Ano de Plublicação", "Autor"
        }));
    }//GEN-LAST:event_btnMostrarTodosGibisActionPerformed
    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void campoTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoTituloMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_campoTituloMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void campoAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoAutorMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_campoAutorMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void campoAnoPublicacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoAnoPublicacaoMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_campoAnoPublicacaoMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void caixaEditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caixaEditorasMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_caixaEditorasMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void cmpNumVolumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpNumVolumesMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_cmpNumVolumesMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void caixaGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caixaGeneroMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_caixaGeneroMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void cmpNumPaginasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpNumPaginasMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_cmpNumPaginasMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void cmpVeiculoPrimeiraPublicacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpVeiculoPrimeiraPublicacaoMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_cmpVeiculoPrimeiraPublicacaoMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void caixaTipologiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caixaTipologiaMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_caixaTipologiaMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void cmpErasComicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpErasComicMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_cmpErasComicMouseClicked

    /**
     * Ação para apagar a mensagem de log ao clicar 
     * em um um dos campos de cadastro de gibis.
     * @param evt Evento do clique 
     */
    private void cmpNumQuadrinhosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpNumQuadrinhosMouseClicked
        msgCadastrarGibi.setText("");
    }//GEN-LAST:event_cmpNumQuadrinhosMouseClicked

    /**
     * Função princial da aplicação.
     * @param args Ignorado pela função.
     */
    public static void main(String args[]) {
        // Para mudar o look and feel do swing
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Cria e mostra a interface */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new InterfaceGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anoGibiEncontrado;
    private javax.swing.JLabel autorGibiEncontrado;
    private javax.swing.JButton bntEscolherArquivo;
    private javax.swing.JButton bntInserirEditora;
    private javax.swing.JButton btnBuscarProximo;
    private javax.swing.JToggleButton btnCadastrarGibi;
    private javax.swing.JButton btnCarregarArquivo;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JToggleButton btnGravarArqSaida;
    private javax.swing.JButton btnListarEditoras;
    private javax.swing.JRadioButton btnMostrarSemTipo;
    private javax.swing.JRadioButton btnMostrarSomenteComics;
    private javax.swing.JRadioButton btnMostrarSomenteMangas;
    private javax.swing.JRadioButton btnMostrarSomenteTirinhas;
    private javax.swing.JRadioButton btnMostrarTodosGibis;
    private javax.swing.JComboBox<String> caixaEditoras;
    private javax.swing.JComboBox<String> caixaGenero;
    private javax.swing.JComboBox<String> caixaTipologia;
    private javax.swing.JTextField campoAnoPublicacao;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoCarregarArquivo;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JTextField cmpCidadeEditora;
    private javax.swing.JComboBox<String> cmpErasComic;
    private javax.swing.JTextField cmpNomeArqSaida;
    private javax.swing.JTextField cmpNomeBusca;
    private javax.swing.JTextField cmpNomeEditora;
    private javax.swing.JTextField cmpNumPaginas;
    private javax.swing.JTextField cmpNumQuadrinhos;
    private javax.swing.JTextField cmpNumVolumes;
    private javax.swing.JTextField cmpPaisEditora;
    private javax.swing.JTextField cmpTelEditora;
    private javax.swing.JTextField cmpVeiculoPrimeiraPublicacao;
    private javax.swing.JLabel editoraGibiEncontrado;
    private javax.swing.JLabel idGibiEncontrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblDadosBarra;
    private javax.swing.JLabel lblEra;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNomeEditora;
    private javax.swing.JLabel lblNumPaginas;
    private javax.swing.JLabel lblNumQuadrinhos;
    private javax.swing.JLabel lblNumVolumes;
    private javax.swing.JLabel lblTipologia;
    private javax.swing.JLabel lblVeiculoPrimeiraPub;
    private javax.swing.JLabel lbltxt;
    private javax.swing.JTabbedPane menuPrincipal;
    private javax.swing.JLabel msgCadastrarGibi;
    private javax.swing.JLabel msgInserirEditora;
    private javax.swing.JLabel msgNenhumEncontrado;
    private javax.swing.JLabel nomeGibiEncontrado;
    private javax.swing.JPanel painelAdicionar;
    private javax.swing.JPanel painelBuscarExcluir;
    private javax.swing.JPanel painelCadastrar;
    private javax.swing.JPanel painelCarregarDeArquivo;
    private javax.swing.JPanel painelGravarEmArquivo;
    private javax.swing.JPanel painelListarEditoras;
    private javax.swing.JPanel painelListarGibis;
    private javax.swing.JRadioButton selComic;
    private javax.swing.JRadioButton selManga;
    private javax.swing.ButtonGroup selMostrarTipo;
    private javax.swing.JRadioButton selOutro;
    private javax.swing.ButtonGroup selTipoGibi;
    private javax.swing.JRadioButton selTirinha;
    private javax.swing.JTable tblListarEditoras;
    private javax.swing.JTable tblListarGibis;
    private javax.swing.JLabel txtAno;
    private javax.swing.JLabel txtAutor;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
