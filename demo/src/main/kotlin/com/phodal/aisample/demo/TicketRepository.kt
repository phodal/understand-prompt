package com.phodal.aisample.demo

import org.springframework.stereotype.Repository

@Repository
interface TicketRepository {
    fun createTicketOrder(ticketOrder: TicketOrder): String

    fun getTicketOrder(orderId: String): TicketOrder
}
