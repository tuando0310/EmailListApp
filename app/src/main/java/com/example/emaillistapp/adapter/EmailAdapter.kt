package com.example.emaillistapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.emaillistapp.R
import com.example.emaillistapp.model.Email

class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]

        // Set the sender name
        holder.senderName.text = email.senderName

        // Set the initial letter of the sender (take the first letter of the sender's name)
        val senderInitial = email.senderName.firstOrNull()?.uppercaseChar() ?: ""
        holder.initialLetter.text = senderInitial.toString()

        // Set the subject
        holder.subject.text = email.subject

        // Set the preview
        holder.preview.text = email.preview

        // Set the timestamp
        holder.timestamp.text = email.timestamp
    }

    override fun getItemCount() = emails.size

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val initialLetter: TextView = itemView.findViewById(R.id.initialLetter)  // Add this for the circular initial
        val senderName: TextView = itemView.findViewById(R.id.senderName)
        val subject: TextView = itemView.findViewById(R.id.subject)
        val preview: TextView = itemView.findViewById(R.id.preview)
        val timestamp: TextView = itemView.findViewById(R.id.timestamp)
    }
}
