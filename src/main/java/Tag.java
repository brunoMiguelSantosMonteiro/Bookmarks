import java.util.Objects;

public class Tag {

    private String tagNome;
    private String nomeTagador;

    public Tag(String tagNome, String nomeTagador) {
        this.tagNome = tagNome;
        this.nomeTagador = nomeTagador;
    }

    public String getTagNome() {
        return tagNome;
    }

    public String getNomeTagador() {
        return nomeTagador;
    }

    public void setTagNome(String tagNome) {
        this.tagNome = tagNome;
    }

    public void setNomeTagador(String nomeTagador) {
        this.nomeTagador = nomeTagador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(tagNome, tag.tagNome)
                && Objects.equals(nomeTagador, tag.nomeTagador);
    }

    @Override
    public String toString() {
        return String.format("Tag: %s Username: %s", tagNome, nomeTagador);
    }
}
