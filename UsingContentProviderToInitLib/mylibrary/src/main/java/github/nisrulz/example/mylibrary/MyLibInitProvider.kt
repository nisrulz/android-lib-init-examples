package github.nisrulz.example.mylibrary

import android.content.ContentProvider
import android.content.ContentValues
import android.net.Uri
import android.util.Log

class MyLibInitProvider : ContentProvider() {
    private val TAG = javaClass.name

    override fun onCreate(): Boolean {
        try {
            MyLib.init(context)
        } catch (ex: Exception) {
            Log.i(TAG, "Failed to auto initialize MyLib", ex)
        }
        return false
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ) = null

    override fun getType(uri: Uri) = null

    override fun insert(uri: Uri, values: ContentValues?) = null

    override fun delete(
        uri: Uri,
        selection: String?,
        selectionArgs: Array<out String>?
    ) = 0

    override fun update(
        uri: Uri, values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ) = 0
}