package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;


import static sample.MyGymManager.member_list;


public class Gui extends Application {
// creating table view
        private TableView table = new TableView();


        @Override
        // initial set up
        public void start(Stage stage) {
            Scene scene = new Scene(new Group());
            stage.setTitle("Gym Member Table");
            stage.setWidth(900);
            stage.setHeight(500);
//creating label
             Label label = new Label("Gym Member Table");


//creating columns for table


            TableColumn member = new TableColumn("Member type");
            TableColumn Name = new TableColumn("Member Name");
            TableColumn Memb_num = new TableColumn(" Member number");
            TableColumn Admission = new TableColumn("Admission day");

//making columns are in table

            table.getColumns().addAll(member,Name, Memb_num, Admission);
            for(int i=0; i<member_list.size();i++) {
                String temp_mem = member_list.get(i).getMember();
                String temp_name = member_list.get(i).getMember_name();
                String temp_number = member_list.get(i).getMember_number();
                String temp_day = member_list.get(i).getAdmission_day();


                final ObservableList<Default_members> data = FXCollections.observableArrayList(
                        new Default_members(temp_mem, temp_name, temp_number, temp_day));

            }
             VBox vbox = new VBox();
            vbox.setSpacing(20);
            vbox.setPadding(new Insets(30, 0, 0, 20));
            vbox.getChildren().addAll(label, table);

            Button find = new Button("Find");
            find.setLayoutX(600);
            find.setLayoutY(70);


//creating text field's so user can search/ view output
            TextField search = new TextField();
            search.setPromptText("search with member number");
            search.setStyle("-fx-prompt-text-fill: black");
            search.setFocusTraversable(false);
            search.setLayoutX(650);
            search.setLayoutY(70);
            search.setMinWidth(50);

            TextField result = new TextField();
            result.setPromptText(" member name");
            result.setStyle("-fx-prompt-text-fill: black");
            result.setLayoutX(600);
            result.setLayoutY(120);
            result.setMinWidth(50);

            TextField result2 = new TextField();
            result2.setPromptText(" member Admission day");
            result2.setStyle("-fx-prompt-text-fill: black");
            result2.setLayoutX(600);
            result2.setLayoutY(150);
            result2.setMinWidth(50);

            find.setOnAction(event -> {

                for (int i = 0; i < member_list.size(); i++) {
//checks if searched value is in list

                    if ((((member_list.get(i)).getMember_number()).equals(search))) ;
                    {
                        result.setText(member_list.get(i).getMember_name());
                        result2.setText(member_list.get(i).getAdmission_day());

                    }
                }
            });








            ((Group) scene.getRoot()).getChildren().addAll(vbox);
            ((Group) scene.getRoot()).getChildren().addAll(search);
            ((Group) scene.getRoot()).getChildren().addAll(result);
            ((Group) scene.getRoot()).getChildren().addAll(result2);
            ((Group) scene.getRoot()).getChildren().addAll(find);

            stage.setScene(scene);
            stage.show();
        }






        public static void main(String[] args) {
            launch(args);
        }

    }

