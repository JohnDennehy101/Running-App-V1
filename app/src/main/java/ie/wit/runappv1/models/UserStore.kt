package ie.wit.runappv1.models

interface UserStore {
    fun findAll(): List<UserModel>
    fun create(user: UserModel)
    fun update(user: UserModel)
    fun findOne(email: String) : UserModel?
}