Pessoa p1 = new Pessoa("Dona Cotinha", "51982860021");
        Pessoa p2 = new Pessoa("Carmem Mercedes ", "123123123");
        Pessoa p3 = new Pessoa("Marilene Rosalinda", "1234564568");

        ArrayList<Pessoa> cadastroPessoas = new ArrayList<>();

        cadastroPessoas.add(p1);
        cadastroPessoas.add(p2);
        cadastroPessoas.add(p3);

        for (Pessoa cadastroPessoa : cadastroPessoas) {
            System.out.println(cadastroPessoa);
        }

        //////////////////////////////////////////////////

        Peca pca1 = new Peca("dC01", "blusa", "Blusa de croche", 15.30, 10.0, "M");
        Peca pca2 = new Peca("dC02", "saia", "Saia de croche", 12.15, 10.0, "M");
        Peca pca3 = new Peca("dC03", "blusa", "Blusa manga longa", 8.15, 10.0, "M");
        Peca pca4 = new Peca("dC04", "saia", "Saia de renda", 35.1, 10.0, "M");
        Peca pca5 = new Peca("carm01", "blusa", "Blusa Rosa da Carmem pagar em 10x", 15.0, 9.5, "P");
        Peca pca6 = new Peca("carm02", "saia", "Saia Rosa da Carmem pagar em 10x", 12.0, 9.5, "P");
        Peca pca7 = new Peca("carm03", "blusa", "Blusa Amarela da Carmem pagar em 10x", 8.0, 9.5, "P");
        Peca pca8 = new Peca("carm04", "saia", "Saia Amarela da Carmem pagar em 10x", 350.0, 9.5, "P");
        Peca pca9 = new Peca("rosaLinda01", "bolsa", "Bolsa marron da dona Rosalinda", 55.9, 10.0, "A");
        Peca pca10 = new Peca("rosaLinda02", "bolsa", "Bolsa amarela da dona Rosalinda", 19.5, 10.0, "A");
        Peca pca11 = new Peca("rosaLinda03", "bolsa", "Bolsa preta de couro da dona Rosalinda", 25.1, 10.0, "A");
        Peca pca12 = new Peca("rosaLinda04", "bolsa", "Bolsa sintetica de praia da dona Rosalinda", 30.89,10.0, "A");

        ArrayList<Peca> listaPecas = new ArrayList<>();
        listaPecas.add(pca1);
        listaPecas.add(pca2);
        listaPecas.add(pca3);
        listaPecas.add(pca4);
        listaPecas.add(pca5);
        listaPecas.add(pca6);
        listaPecas.add(pca7);
        listaPecas.add(pca8);
        listaPecas.add(pca9);
        listaPecas.add(pca10);
        listaPecas.add(pca11);
        listaPecas.add(pca12);

        for (Peca peca : listaPecas) {
            System.out.println(peca);
        }