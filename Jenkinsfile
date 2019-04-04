#! groovy

oleoduto {
  agente qualquer
  estágios {
        
        stage ( ' Docker Build ' ) {
            agente qualquer
            passos {
                sh ' janela de encaixe construção -f Dockerfile -t demo / oracle-java: 8. '
            }
        }
        stage ( ' Docker Compile Class ' ) {
            agente qualquer
            passos {
                sh ' cd HelloWorld && docker run --rm -v $ PWD: / app -w / aplicativo demo / oracle-java: 8 javac Main.java '
            }
        }    
        stage ( ' Docker Execute Java Class ' ) {
            agente qualquer
            passos {
                sh ' cd HelloWorld && docker run --rm -v $ PWD: / app -w / aplicativo demo / oracle-java: 8 javac Main.java e& docker run --rm -v $ PWD: / app -w / app demo / oracle-java: 8 java principal '
            }
        }        
    }
    post {
        sempre {
            echo ' Isso sempre será executado '
        }
        success {
            echo ' Isso funcionará somente se for bem-sucedido '
        }
        falha {
            echo ' Isso será executado somente se houver falha '
        }
        instável {
            echo ' Isso será executado somente se a corrida foi marcada como instável '
        }
        changed {
            echo ' Isso será executado somente se o estado do Pipeline for alterado '
            echo ' Por exemplo, se o Pipeline já estava falhando, mas agora é bem-sucedido '
        }
    }

}
