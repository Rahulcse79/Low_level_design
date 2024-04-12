#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Order
{
    private:
    
    vector<string> items;
    vector<int> quantities;
    vector<double> prices;
    string status;
    
    public:
    
    Order() : status("Open") {}
    
    void addItem(const string &name, int quantity, double price)
    {
        items.push_back(name);
        quantities.push_back(quantity);
        prices.push_back(price);
    }
    
    double totalPrice() const
    {
        double total = 0;
        
        for(size_t i=0; i<prices.size(); i++)
        {
            total += quantities[i] * prices[i]; 
        }
        
        return total;
    }
    
    void setStatus(const string &newStatus)
    {
        status = newStatus;
    }
    
    const string &getStatus() const
    {
        return status;
    }
};

class PaymentProcessor {   // Interface
    
    public:
    
    virtual void pay(Order& order, string securityCode) = 0;
    
    virtual ~PaymentProcessor() {}
};

class DebitPaymentProcessor: public PaymentProcessor
{
    public:
    
    void pay(Order& order, string securityCode) override
    {
        cout<<"Processing debit payment type"<<endl;
        cout<<"Verifying security code: "<<securityCode<<endl;
        order.setStatus("paid");
        cout<<"Debit payment called !"<<endl;
    }
};

class CreditPaymentProcessor: public PaymentProcessor
{
    public:
    
    void pay(Order& order, string securityCode) override
    {
        cout<<"Processing credit payment type "<<endl;
        cout<<"Verifying security code: "<<securityCode<<endl;
        order.setStatus("paid");
        cout<<"credit payment called !"<<endl;
    }
};

class UPIPaymentProcessor: public PaymentProcessor
{
    public:
    
    void pay(Order& order, string securityCode) override
    {
        cout<<"Processing UPI payment type "<<endl;
        cout<<"Verifying security code: "<<endl;
        order.setStatus("paid");
        cout<<"UPI payment called !"<<endl;
    }
};

int main()
{
    Order order;
    order.addItem("keyboard", 1, 50);
    order.addItem("SSD", 1, 150);
    order.addItem("USB cable", 2, 5);
    
    cout<<order.totalPrice()<<endl;
    
    string securityCode = "rahul@123";
    
    PaymentProcessor* processor = new UPIPaymentProcessor;
    processor->pay(order, securityCode);
    
    cout<<order.getStatus()<<endl;
    
    return 0;
}
