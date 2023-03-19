package com.justamandd.nubankclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.justamandd.nubankclone.adapter.AdapterFastActionItem
import com.justamandd.nubankclone.adapter.AdapterProductApproach
import com.justamandd.nubankclone.databinding.ActivityMainBinding
import com.justamandd.nubankclone.model.FastActionItem
import com.justamandd.nubankclone.model.ProductApproach

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterFastActionItem: AdapterFastActionItem
    private lateinit var adapterProductApproach: AdapterProductApproach
    private val fastActionItemElements: MutableList<FastActionItem> = mutableListOf()
    private val productApproachElements: MutableList<ProductApproach> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerFastActionItems = binding.recyclerFastActionList
        recyclerFastActionItems.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerFastActionItems.setHasFixedSize(true)
        adapterFastActionItem = AdapterFastActionItem(this, fastActionItemElements)
        recyclerFastActionItems.adapter = adapterFastActionItem
        createFastActionItems()

        val recyclerProductApproches = binding.recyclerProducts
        recyclerProductApproches.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerProductApproches.setHasFixedSize(true)
        adapterProductApproach = AdapterProductApproach(this, productApproachElements)
        recyclerProductApproches.adapter = adapterProductApproach
        createProductApproachItems()

    }

    private fun createProductApproachItems() {
        val textProductApproach1 = ProductApproach("Participe da promoção Tudo no Roxinho e concorra a...")
        productApproachElements.add(textProductApproach1)
        val textProductApproach2 = ProductApproach("Chegou o débito automático da fatura do cartão")
        productApproachElements.add(textProductApproach2)
        val textProductApproach3 = ProductApproach("Conheça a conta PJ: prática e livre de burocracia para se...")
        productApproachElements.add(textProductApproach3)
        val textProductApproach4 = ProductApproach("Salve seus amigos da burocracia: Faça um convite...")
        productApproachElements.add(textProductApproach4)
    }

    private fun createFastActionItems() {
        val pix = FastActionItem(R.drawable.ic_pix, "Área Pix")
        fastActionItemElements.add(pix)

        val invest = FastActionItem(R.drawable.ic_invest, "Investir")
        fastActionItemElements.add(invest)

        val charge = FastActionItem(R.drawable.ic_charge, "Cobrar")
        fastActionItemElements.add(charge)

        val recharge = FastActionItem(R.drawable.ic_phone_recharge, "Recarga")
        fastActionItemElements.add(recharge)
    }
}