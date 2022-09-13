1. Command
2. ConcreteCommand (PasteCommand, OpenCommand.AddCommand)
3. Client (Application,CustomerService) creates a ConcreteCommand object and sets its receiver.
4. Invoker (MenuItem)   asks the command to carry out the request.
5. Receiver (Document, Application)   knows how to perform the operations associated with carrying out
a request. Any class may serve as a Receiver.



Composite means made up of several parts or elements: