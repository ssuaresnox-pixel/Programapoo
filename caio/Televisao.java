import java.util.ArrayList;
import java.util.List;

public class Televisao {
    private String numeroSerie;
    private String modelo;
    private boolean ligada;
    private int volume;
    private int canalAtual;
    private List<Canal> canais;
    private final int VOLUME_MAXIMO = 100;
    private final int VOLUME_MINIMO = 0;
    
   
    public Televisao(String numeroSerie, String modelo) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.ligada = false;
        this.volume = 20;
        this.canalAtual = 1;
        this.canais = new ArrayList<>();
        inicializarCanaisPadrao();
    }
    
    
    private void inicializarCanaisPadrao() {
        canais.add(new Canal(1, "Globo", "Variedades"));
        canais.add(new Canal(2, "SBT", "Entretenimento"));
        canais.add(new Canal(3, "Record", "Variedades"));
        canais.add(new Canal(4, "Band", "Variedades"));
        canais.add(new Canal(5, "RedeTV", "Entretenimento"));
    }
    
 
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println(" TV ligada!");
        } else {
            System.out.println(" A TV já está ligada!");
        }
    }
    
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("TV desligada!");
        } else {
            System.out.println(" A TV já está desligada!");
        }
    }
    
   
    public void aumentarVolume() {
        if (ligada) {
            if (volume < VOLUME_MAXIMO) {
                volume++;
                System.out.println(" Volume: " + volume);
            } else {
                System.out.println(" Volume máximo atingido!");
            }
        } else {
            System.out.println(" TV desligada! Ligue primeiro.");
        }
    }
    
    public void diminuirVolume() {
        if (ligada) {
            if (volume > VOLUME_MINIMO) {
                volume--;
                System.out.println(" Volume: " + volume);
            } else {
                System.out.println(" Volume mínimo atingido!");
            }
        } else {
            System.out.println(" TV desligada! Ligue primeiro.");
        }
    }
    
 
    public void trocarCanal(int numeroCanal) {
        if (ligada) {
            for (Canal canal : canais) {
                if (canal.getNumero() == numeroCanal) {
                    canalAtual = numeroCanal;
                    System.out.println(" Canal alterado para: " + canal.getNome());
                    return;
                }
            }
            System.out.println(" Canal " + numeroCanal + " não encontrado!");
        } else {
            System.out.println(" TV desligada! Ligue primeiro.");
        }
    }
    
    public void proximoCanal() {
        if (ligada) {
            int indexAtual = -1;
            for (int i = 0; i < canais.size(); i++) {
                if (canais.get(i).getNumero() == canalAtual) {
                    indexAtual = i;
                    break;
                }
            }
            
            if (indexAtual != -1) {
                int proximoIndex = (indexAtual + 1) % canais.size();
                canalAtual = canais.get(proximoIndex).getNumero();
                System.out.println(" Canal: " + canais.get(proximoIndex).getNome());
            }
        } else {
            System.out.println(" TV desligada! Ligue primeiro.");
        }
    }
    
    public void canalAnterior() {
        if (ligada) {
            int indexAtual = -1;
            for (int i = 0; i < canais.size(); i++) {
                if (canais.get(i).getNumero() == canalAtual) {
                    indexAtual = i;
                    break;
                }
            }
            
            if (indexAtual != -1) {
                int anteriorIndex = (indexAtual - 1 + canais.size()) % canais.size();
                canalAtual = canais.get(anteriorIndex).getNumero();
                System.out.println(" Canal: " + canais.get(anteriorIndex).getNome());
            }
        } else {
            System.out.println(" TV desligada! Ligue primeiro.");
        }
    }
    
    
    public void adicionarCanal(Canal canal) {
        for (Canal c : canais) {
            if (c.getNumero() == canal.getNumero()) {
                System.out.println(" Já existe um canal com este número!");
                return;
            }
        }
        canais.add(canal);
        System.out.println(" Canal adicionado: " + canal.getNome());
    }
    
    public void removerCanal(int numeroCanal) {
        for (int i = 0; i < canais.size(); i++) {
            if (canais.get(i).getNumero() == numeroCanal) {
                Canal canalRemovido = canais.remove(i);
                System.out.println(" Canal removido: " + canalRemovido.getNome());
                return;
            }
        }
        System.out.println(" Canal " + numeroCanal + " não encontrado!");
    }
    
    public void listarCanais() {
        if (canais.isEmpty()) {
            System.out.println(" Nenhum canal cadastrado!");
        } else {
            System.out.println("\n LISTA DE CANAIS:");
            for (Canal canal : canais) {
                String marcador = (canal.getNumero() == canalAtual) ? "▶ " : "  ";
                System.out.println(marcador + canal);
            }
        }
    }
    
    
    public void verInformacoes() {
        System.out.println("\n INFORMAÇÕES DA TV:");
        System.out.println(" Modelo: " + modelo);
        System.out.println(" Número de Série: " + numeroSerie);
        System.out.println(" Status: " + (ligada ? "Ligada" : "Desligada"));
        System.out.println(" Volume: " + volume);
        
        Canal canalAtualObj = getCanalAtual();
        if (canalAtualObj != null) {
            System.out.println(" Canal Atual: " + canalAtualObj.getNome());
        } else {
            System.out.println(" Canal Atual: " + canalAtual);
        }
        
        System.out.println(" Total de Canais: " + canais.size());
    }
    
 
    private Canal getCanalAtual() {
        for (Canal canal : canais) {
            if (canal.getNumero() == canalAtual) {
                return canal;
            }
        }
        return null;
    }
    
    public int getCanalAtualNumero() {
        return canalAtual;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public boolean isLigada() {
        return ligada;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public String getModelo() {
        return modelo;
    }
}
