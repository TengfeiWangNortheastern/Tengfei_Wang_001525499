/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Order.MasterOrderList;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender; //current res, future customer
    private UserAccount receiver;// current deliv, future deliv
    private UserAccount deliver;//current deliv, future res
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String feedbackOfRestaurantFromCustomer;
    private String feedbackOfDeliveryManFromCustomer;
    private Order order;
    public WorkRequest(){
        requestDate = new Date();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getFeedbackOfRestaurantFromCustomer() {
        return feedbackOfRestaurantFromCustomer;
    }

    public void setFeedbackOfRestaurantFromCustomer(String feedbackOfRestaurantFromCustomer) {
        this.feedbackOfRestaurantFromCustomer = feedbackOfRestaurantFromCustomer;
    }

    public String getFeedbackOfDeliveryManFromCustomer() {
        return feedbackOfDeliveryManFromCustomer;
    }

    public void setFeedbackOfDeliveryManFromCustomer(String feedbackOfDeliveryManFromCustomer) {
        this.feedbackOfDeliveryManFromCustomer = feedbackOfDeliveryManFromCustomer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getDeliver() {
        return deliver;
    }

    public void setDeliver(UserAccount deliver) {
        this.deliver = deliver;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return status;
    }
    
}
