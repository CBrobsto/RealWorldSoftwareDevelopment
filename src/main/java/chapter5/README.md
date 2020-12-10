Business Rules Engine Requirements
==================================

*The following text originates directly from the book on page 90.* 
*Refer to the README.md at the top-level of the project for publication information.*

>Before you start, let’s think about what is it you want to achieve. You’d like to enable nonprogrammers to add or 
>change business logic in their own workflow. For example, a marketing executive may wish to apply a special 
>discount when a prospect is making an inquiry about one of your products and fits certain criteria. An accounting 
>executive may wish to create an alert if expenses are unusually high. These are examples of what you can achieve 
>with a Business Rules Engine. It’s essentially software that executes one or more business rules that are often 
>declared using a simple bespoke language. A Business Rules Engine can support multiple different components:
>
>- Facts
>   - The available information to which rules have access
>
>- Actions
>    - The operation you want to perform
>
>- Conditions
>    - These specify when an action should be triggered
>
>- Rules
>   - These specify the business logic you want to execute, essentially grouping facts, conditions, and actions together
