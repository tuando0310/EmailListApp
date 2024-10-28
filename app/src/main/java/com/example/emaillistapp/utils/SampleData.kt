package com.example.emaillistapp.utils

import com.example.emaillistapp.model.Email

object SampleData {
    fun getEmails(): List<Email> {
        return listOf(
            Email("Trello", "18 new notifications on CPAD Project", "Here's the latest...", "10:18"),
            Email("Quora Digest", "Who wrote the lyrics to Michelle by The...", "This question goes back over 50 years ago...", "01:27"),
            Email("Riot Games", "Mã Đăng Nhập: 743496", "Mã Đăng Nhập Đây là mã phê duyệt đăng n...", "26 thg 10"),
            Email("MongoDB", "The MongoDB Query API will power up y...", "Use a single API for a variety of queries – se...", "26 thg 10"),
            Email("Trello", "18 new notifications on CPAD Project", "Here's the latest...", "10:18"),
            Email("Quora Digest", "Who wrote the lyrics to Michelle by The...", "This question goes back over 50 years ago...", "01:27"),
            Email("Riot Games", "Mã Đăng Nhập: 743496", "Mã Đăng Nhập Đây là mã phê duyệt đăng n...", "26 thg 10"),
            Email("MongoDB", "The MongoDB Query API will power up y...", "Use a single API for a variety of queries – se...", "26 thg 10"),
            Email("Trello", "18 new notifications on CPAD Project", "Here's the latest...", "10:18"),
            Email("Quora Digest", "Who wrote the lyrics to Michelle by The...", "This question goes back over 50 years ago...", "01:27"),
            Email("Riot Games", "Mã Đăng Nhập: 743496", "Mã Đăng Nhập Đây là mã phê duyệt đăng n...", "26 thg 10"),
            Email("MongoDB", "The MongoDB Query API will power up y...", "Use a single API for a variety of queries – se...", "26 thg 10"),
        // Add more sample data as needed
        )
    }
}
