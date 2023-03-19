package com.justamandd.nubankclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.justamandd.nubankclone.adapter.AdapterFastActionItem
import com.justamandd.nubankclone.databinding.ActivityMainBinding
import com.justamandd.nubankclone.model.FastActionItem

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterFastActionItem: AdapterFastActionItem
    private val fastActionItemElements: MutableList<FastActionItem> = mutableListOf()


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