package com.phodal.aisample.demo

import org.springframework.stereotype.Service

@Service
class TicketService(
    val repository: TicketRepository
) {
    fun createTicketOrder(ticketOrder: TicketOrder): String {

    }

}
