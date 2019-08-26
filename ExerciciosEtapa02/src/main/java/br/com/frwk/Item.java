package br.com.frwk;

public class Item {
    private String nomeItem;

    public Item(String _nomeItem){
        nomeItem(_nomeItem);
    }

    public String nomeItem() {
        return nomeItem;
    }

    public void nomeItem(String nomeItem) {
        if (nomeItem != null){
            this.nomeItem = nomeItem;
        }
    }

}
