package Sliit.Task.TaskManagement.database.repositories

import Sliit.Task.TaskManagement.database.TodoDatabase
import Sliit.Task.TaskManagement.model.Todo

class TodoRepository(private val database:TodoDatabase) {

    fun get(id:Int) = database.getDao().get(id)
    suspend fun update(id:Int,title:String,description:String,priority:String,deadLineDate:Long) = database.getDao().update(id,title,description,priority,deadLineDate)
    suspend fun insert(todo:Todo) = database.getDao().insert(todo)
    suspend fun delete(todo:Todo) = database.getDao().delete(todo)
    fun getAllTodo():List<Todo> = database.getDao().getAll()

}