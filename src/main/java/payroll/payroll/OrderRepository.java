package payroll.payroll;

//JPA doesn't seem to be registering properly either???
interface OrderRepository extends JpaRepository<Order, Long> {
}
