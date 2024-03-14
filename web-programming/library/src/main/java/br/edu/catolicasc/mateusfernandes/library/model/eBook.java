package br.edu.catolicasc.mateusfernandes.library.model;

import jakarta.persistence.*;

@Entity
public class eBook extends Book{
    @Enumerated(EnumType.STRING)
    private Format model;

    public Format getModel() {
        return model;
    }
    public void setModel(Format model) {
        this.model = model;
    }
}

enum Format {
    PDF,
    PUB,
    MOD
}