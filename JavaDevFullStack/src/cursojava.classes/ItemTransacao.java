import java.util.UUID;

public class ItemTransacao {

    UUID idTransacao;
    String nomeTransacao;
    double valorTransacao;
    String tagTransacao;
    String dataCompraTransacao;
    String formaPagamentoTransacao;

    public ItemTransacao(UUID idTransacao, String nomeTransacao, double valorTransacao, String tagTransacao,
            String dataCompraTransacao, String formaPagamentoTransacao) {
        this.idTransacao = UUID.randomUUID();
        this.nomeTransacao = nomeTransacao;
        this.valorTransacao = valorTransacao;
        this.tagTransacao = tagTransacao;
        this.dataCompraTransacao = dataCompraTransacao;
        this.formaPagamentoTransacao = formaPagamentoTransacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeTransacao == null) ? 0 : nomeTransacao.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valorTransacao);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((tagTransacao == null) ? 0 : tagTransacao.hashCode());
        result = prime * result + ((dataCompraTransacao == null) ? 0 : dataCompraTransacao.hashCode());
        result = prime * result + ((formaPagamentoTransacao == null) ? 0 : formaPagamentoTransacao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemTransacao other = (ItemTransacao) obj;
        if (nomeTransacao == null) {
            if (other.nomeTransacao != null)
                return false;
        } else if (!nomeTransacao.equals(other.nomeTransacao))
            return false;
        if (Double.doubleToLongBits(valorTransacao) != Double.doubleToLongBits(other.valorTransacao))
            return false;
        if (tagTransacao == null) {
            if (other.tagTransacao != null)
                return false;
        } else if (!tagTransacao.equals(other.tagTransacao))
            return false;
        if (dataCompraTransacao == null) {
            if (other.dataCompraTransacao != null)
                return false;
        } else if (!dataCompraTransacao.equals(other.dataCompraTransacao))
            return false;
        if (formaPagamentoTransacao == null) {
            if (other.formaPagamentoTransacao != null)
                return false;
        } else if (!formaPagamentoTransacao.equals(other.formaPagamentoTransacao))
            return false;
        return true;
    }

    public String getNomeTransacao() {
        return nomeTransacao;
    }

    public void setNomeTransacao(String nomeTransacao) {
        this.nomeTransacao = nomeTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getTagTransacao() {
        return tagTransacao;
    }

    public void setTagTransacao(String tagTransacao) {
        this.tagTransacao = tagTransacao;
    }

    public String getDataCompraTransacao() {
        return dataCompraTransacao;
    }

    public void setDataCompraTransacao(String dataCompraTransacao) {
        this.dataCompraTransacao = dataCompraTransacao;
    }

    public String getFormaPagamentoTransacao() {
        return formaPagamentoTransacao;
    }

    public void setFormaPagamentoTransacao(String formaPagamentoTransacao) {
        this.formaPagamentoTransacao = formaPagamentoTransacao;
    }

    @Override
    public String toString() {
        return "ItemTransacao [idTransacao=" + idTransacao + ", nomeTransacao=" + nomeTransacao + ", valorTransacao="
                + valorTransacao + ", tagTransacao=" + tagTransacao + ", dataCompraTransacao=" + dataCompraTransacao
                + ", formaPagamentoTransacao=" + formaPagamentoTransacao + "]";
    }

}