package br.unincor.control;

import br.unincor.dao.GenericDAO;
import br.unincor.model.Musica;
import br.unincor.view.ViewGUI;

public class Main {
	
	public static void main(String[] args){
		GenericDAO gd = new GenericDAO();
		ViewGUI gui = new ViewGUI();
		
		int opcao = -2;
		
		while(opcao != -1){
			
			opcao = gui.exibeMenuPrincipal();
			
			if(opcao == 0){
				Musica m = new Musica(0,
					gui.recebeTexto("Entre com o nome da música"),
					gui.recebeTexto("Entre com a(o) artista"),
					gui.recebeTexto("Entre com o álbum"), 
					gui.recebeLong("Entre com a duração")
				);
				
				try{
					gd.insertMusica(m);
					
					m.setId(gd.buscaUltimoId());
					
					gui.exibeMsg(m.toString());
				}catch(Exception e){
					gui.exibeMsgErro("Erro ao inserir música");;
				}
			}
			else if(opcao == 1){
				int id = gui.recebeInt("Entre com o ID da música a ser alterada");
				
				if(id <= gd.buscaUltimoId()){
					try{
						Musica m = new Musica(0,
							gui.recebeTexto("Entre com o nome da música"),
							gui.recebeTexto("Entre com a(o) artista"),
							gui.recebeTexto("Entre com o álbum"), 
							gui.recebeLong("Entre com a duração")
						);
						
						gd.updateMusica(id, m);
						
						gui.exibeMsg(gd.buscaUltimaAlterada(id));
						
					}catch(Exception e){
						gui.exibeMsgErro("Erro ao alterar música");
					}
				}	
				else{
					gui.exibeMsgErro("ID inexistente");;
				}
			}
		}
	}
}
