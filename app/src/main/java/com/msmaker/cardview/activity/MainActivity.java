package com.msmaker.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.msmaker.cardview.R;
import com.msmaker.cardview.adapter.PostagemAdapter;
import com.msmaker.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Marco Silva","#tbt Viagem Legal",R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Alexandre Silva","#tbt Melhor Viagem",R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Dayana Belmiro","#tbt Viagem Top",R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Aline Silva","#tbt Viagem Inesquecível",R.drawable.imagem4);
        this.postagens.add(p);
    }
}
