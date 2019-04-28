# Specification Based Testing Techniques  Assignment
## Credit card discount decision table:
A decision table is a good way to derive test cases using combinations of inputs. It is alo Causeeffect
 table. Developers and analysts finds it very helpful when there is need to test complex 
business rules to be deployed in an application. It can be used in test design but not in specifications
as they help testers in determining the combination of inputs and other software states that must
correctly implement business rules.
If you are a new customer opening a credit card account, you will get a 15% discount on all
your purchases today. If you are an existing customer and you have a loyalty card, you get a 10% 
discount.If you have a coupon, you can get 20% off today.

![Discition_Table](https://user-images.githubusercontent.com/31739314/56863755-979d1b00-69ba-11e9-90ee-2ffa9fc4b4ea.png)


## ATM State Diagram:
ATM is initially turned off. After the power is turned on, ATM performs startup action and enters Self Test state. If the test fails, ATM goes into Out of Service state, otherwise there is triggerless transition to the Idle state. In this state ATM waits for customer interaction.
Each arrow in the diagram can be translated into a test. Testing multiple transaction has the benefits of making sure one transaction does not influence another.

![ATM_STATE](https://user-images.githubusercontent.com/31739314/56863606-db8f2080-69b8-11e9-8095-f8d806e0ccc6.png)
 
## Equivalence partitions: 
Equivalence Partitioning is also known as Equivalence Class Partitioning. In equivalence partitioning, inputs to the software or system are divided into groups that are expected to exhibit similar behavior, so they are likely to be proposed in the same way. Hence selecting one input from each group to design the test cases

![lower_Boundary](https://user-images.githubusercontent.com/31739314/56863779-d7fc9900-69ba-11e9-90f3-081b97097d55.png)

## Hamcrest and Hamcrest Setup
Hamcrest is the well-known framework used for unit testing in the Java ecosystem. It’s bundled in JUnit and simply put, it uses existing predicates – called matcher classes – for making assertions.
In this tutorial, we will explore the Hamcrest API and learn how to take advantage of it to write neater and more intuitive unit tests for our software.

We can use Hamcrest with maven by adding the following dependency to our pom.xml file:

![Hamcrest](https://user-images.githubusercontent.com/31739314/56863938-f499d080-69bc-11e9-81b1-a044b263289d.png)
