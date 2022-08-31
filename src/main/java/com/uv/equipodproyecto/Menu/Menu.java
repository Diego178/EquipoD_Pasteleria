package com.uv.equipodproyecto.Menu;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu extends BorderPane {
    Label titulo = new Label("Bienvenido");
    Label lb1;
    Label lb2;
    Label lb3;
    Label lb4;
    Label lb5;
    Label lb6;
    GridPane menu;

    public Menu(Stage stage) {
        this.titulo.getStyleClass().add("label-titulo-Grande");
        this.titulo.setLayoutX(430.0);
        this.titulo.setLayoutY(40.0);
        this.menu = new GridPane();
        Button butGrafica = new Button();
        butGrafica.setOnAction((evtm) -> {
            //this.crearVentanaGrafica();
        });
        Image igrafica = new Image(this.getClass().getResourceAsStream("Grafica.jpeg"));
        butGrafica.setGraphic(new ImageView(igrafica));
        butGrafica.setLayoutX(50.0);
        butGrafica.setLayoutY(100.0);
        butGrafica.getStyleClass().add("cssBoton");
        this.lb1 = new Label("Graficas");
        Button butVenta = new Button();
        butVenta.setOnAction((evtm) -> {
            //this.crearVentanaVenta();
        });
        Image inuevaVenta = new Image(this.getClass().getResourceAsStream("Venta.jpeg"));
        butVenta.setGraphic(new ImageView(inuevaVenta));
        butVenta.setMaxSize(2.0, 2.0);
        butVenta.setLayoutX(300.0);
        butVenta.setLayoutY(100.0);
        butVenta.getStyleClass().add("cssBoton");
        this.lb2 = new Label("Generar venta");
        Button butPedido = new Button();
        butPedido.setOnAction((evtm) -> {
            //this.crearVentanaPedido();
        });
        Image iagregarPedido = new Image(this.getClass().getResourceAsStream("AgregarPedido.jpeg"));
        butPedido.setGraphic(new ImageView(iagregarPedido));
        butPedido.setMaxSize(2.0, 2.0);
        butPedido.setLayoutX(620.0);
        butPedido.setLayoutY(100.0);
        butPedido.getStyleClass().add("cssBoton");
        this.lb3 = new Label("Agregar pedido");
        Button butAgregar = new Button();
        Image iagregarPastel = new Image(this.getClass().getResourceAsStream("AgregarPastel.jpeg"));
        butAgregar.setGraphic(new ImageView(iagregarPastel));
        butAgregar.setMaxSize(2.0, 2.0);
        butAgregar.setLayoutX(50.0);
        butAgregar.setLayoutY(300.0);
        butAgregar.getStyleClass().add("cssBoton");
        this.lb4 = new Label("Agregar pasteles");
        butAgregar.setOnAction((evtm) -> {
            //this.crearVentanaAgregarPastel();
        });
        Button butPendiente = new Button();
        butPendiente.setOnAction((evtm) -> {
            System.out.println("OK clicked5.");
        });
        Image ipedidoPendiente = new Image(this.getClass().getResourceAsStream("PedidoPendiente.jpeg"));
        butPendiente.setGraphic(new ImageView(ipedidoPendiente));
        butPendiente.setMaxSize(2.0, 2.0);
        butPendiente.setLayoutX(300.0);
        butPendiente.setLayoutY(300.0);
        butPendiente.getStyleClass().add("cssBoton");
        this.lb5 = new Label("Pedidos pendientes");
        butPendiente.setOnAction((evtm) -> {
           // this.crearVentanaPedidosPendientes();
        });
        Button butSalir = new Button();
        butSalir.setOnAction((evt) -> {
            stage.close();
        });
       Image isalir = new Image(this.getClass().getResourceAsStream("Salir.jpeg"));
        butSalir.setGraphic(new ImageView(isalir));
        butSalir.setMaxSize(5.0, 5.0);
        butSalir.setLayoutX(620.0);
        butSalir.setLayoutY(300.0);
        butSalir.getStyleClass().add("cssBoton");
        this.lb6 = new Label("Salir");
        this.menu.add(butGrafica, 1, 1);
        this.menu.add(this.lb1, 1, 2);
        this.menu.add(butVenta, 2, 1);
        this.menu.add(this.lb2, 2, 2);
        this.menu.add(butPedido, 3, 1);
        this.menu.add(this.lb3, 3, 2);
        this.menu.add(butAgregar, 1, 3);
        this.menu.add(this.lb4, 1, 4);
        this.menu.add(butPendiente, 2, 3);
        this.menu.add(this.lb5, 2, 4);
        this.menu.add(butSalir, 3, 3);
        this.menu.add(this.lb6, 3, 4);
        this.titulo.setPrefHeight(70.0);
        this.titulo.setAlignment(Pos.CENTER);
        this.setTop(this.titulo);
        this.menu.setAlignment(Pos.CENTER);
        this.setCenter(this.menu);
        this.titulo.setPadding(new Insets(20.0, 20.0, 20.0, 650.0));
        this.menu.setVgap(20.0);
        this.menu.setHgap(20.0);
    }

    /*private void crearVentanaGrafica() {
        Stage stage = new Stage();
        Pane menu = new PantallaGraficas();
        Scene scene = new Scene(menu, 1050.0, 700.0);
        scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Pedidos pendientes");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void crearVentanaPedidosPendientes() {
        Stage stage = new Stage();
        Pane menu = new PantallaPedidosPendientes();
        Scene scene = new Scene(menu, 1050.0, 700.0);
        scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Pedidos pendientes");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void crearVentanaAgregarPastel() {
        Stage stage = new Stage();
        Pane menu = new PantallaAgregarPastel(stage);
        Scene scene = new Scene(menu, 1000.0, 700.0);
        scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Agregar Pastel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void crearVentanaPedido() {
        Stage stage = new Stage();
        Pane menu = new PantallaPedidos();
        Scene scene = new Scene(menu, 1200.0, 700.0);
        scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Pedido");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void crearVentanaVenta() {
        Stage stage = new Stage();
        Pane menu = new PantallaVenta(stage);
        Scene scene = new Scene(menu, 1250.0, 700.0);
        scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }*/
}