package com.example.scheduler.exception

class InvalidDateException  : RuntimeException  {
    constructor() : super()
    constructor(message :String , cause :Throwable) : super(message , cause)
    constructor(message :String) :super(message)
    constructor(cause: Throwable) :super(cause)
}