package com.events.ticket.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "ticket_types")
@Getter@Setter@NoArgsConstructor@AllArgsConstructor
@Builder
public class TicketType {
}
