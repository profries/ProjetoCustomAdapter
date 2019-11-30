package com.example.projetocustomadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.projetocustomadapter.adapter.ProdutoAdapter
import com.example.projetocustomadapter.model.Produto

class MainActivity : AppCompatActivity() {
    var produtos= ArrayList<Produto>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iniciaListaProdutos();
        setContentView(R.layout.activity_main)


        var listView: ListView = findViewById(R.id.listViewProdutos);
        listView.setAdapter(ProdutoAdapter(this,produtos));

    }

    private fun iniciaListaProdutos() {
        produtos.add(Produto("produto1",30.0));
        produtos.add(Produto("produto2",40.0));
        produtos.add(Produto("produto3",50.0));
        produtos.add(Produto("produto4",70.0));
    }
}
