package Project01;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrincipalController implements Initializable {
    
    @FXML
    private TextField Nfuncionario;
    
    @FXML
    private TextField Ncomputador;
        
    @FXML
    private JFXButton Cadastrar;
 
    @FXML
    private Label Resultado;


    @FXML
    private void ButtonCadastrarAction(ActionEvent event) {
        
        try{
            
            OrdemServiço novaOS = new OrdemServiço(Nfuncionario.getText(),Integer.parseInt(Ncomputador.getText()));
        
            Resultado.setText("Cadastrado Com Sucesso!");   
            
            Nfuncionario.clear();
            Ncomputador.clear();
            
        }catch(Exception e){
            
            System.out.println(e);
            System.out.println("Cadastro NÃO REALIZADO");
            Resultado.setText("Cadastro Não realizado, revise os campos!");
            
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
