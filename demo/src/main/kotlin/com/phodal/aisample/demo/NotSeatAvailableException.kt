class NotSeatAvailableException : RuntimeException() {
    override val message: String?
        get() = "No seat avaliable"
}
