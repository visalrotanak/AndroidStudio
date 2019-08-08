package com.example.contectmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        registerForContextMenu(text)
        button.setOnClickListener {
            var popup = PopupMenu(this,it)
            popup.inflate(R.menu.menu)
            popup.show()

            popup.setOnMenuItemClickListener{
                when(it.itemId) {
                    R.id.op1 -> {
                        Toast.makeText(this, "You order Pizza", Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.op2 -> {
                        Toast.makeText(this, "You order burger", Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.op3 -> {
                        Toast.makeText(this, "You order sandwich", Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> {
                        Toast.makeText(this, "You order nothing", Toast.LENGTH_LONG).show()
                        true
                    }
                }
            }
        }
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu,menu)
    }
}
