package com.example.taskapp

import java.io.Serializable
import java.util.Date
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import kotlinx.android.synthetic.main.content_input.*

open class Task : RealmObject(), Serializable {
    var title: String = ""      // タイトル
    var contents: String = ""   // 内容
    var date: Date = Date()     // 日時
    var category :String = "" //カテゴリ　追加

    // idをプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0

}