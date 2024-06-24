package com.acme.lojaAcme.Patterns.Adapter;

public class TelefoneAdapter {
    public static String adaptarTelefone(String telefone) {
        // Remove todos os caracteres não numéricos do número de telefone

        return telefone.replaceAll("[^0-9]", "");
    }
}
