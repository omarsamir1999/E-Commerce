package ecommerce.order.models;

import ecommerce.order.helpers.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @CreatedDate
    private LocalDateTime date;
    private Double price;
    private String couponCode;
    private Double couponValue;
    private Double paidPrice;
    private String customerEmail;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private Long transactionId;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> orderItemsList;
}
