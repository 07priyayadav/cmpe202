# Lab 10:AspectJ & Feature IDE

### Lab1 : 
#### Implementation of a way to support instantiating Gumball Machines that can support 3 models as below
1. Cost 25 cents - Accepts only Quaters.
2. Cost 50 cents - Accepts two Quaters.
3. Cost 50 cents - Accepts all coins.

To achieve this, I used polymorphism with 3 different classes associated with three different gumball machine models.

We couldn't achive this with single class in a single solution.

To overcome this I used AspectJ and Feature IDE.

### Lab10 :
1. In AspectJ and Feature IDE, user need to just set the vaalid possible options of models as per their requirements in config file.
2. There is no additional classes or code required to support instatiation of 3 different Gumball Machines.
3. This modular approach makes easier to add new funcationality.

Below screenshots can demonstrates AspectJ and Feature IDE model config changes to instantiate desired model.

1. Crank Model: Cost 25, accepts One Quater.

![Crank Model](https://github.com/07priyayadav/cmpe202/blob/master/lab10/output/CrankModelOneQTRCost25.jpeg)

2. Crank Model: Cost 50, accepts two Quater.

![Crank Model](hhttps://github.com/07priyayadav/cmpe202/blob/master/lab10/output/CrankModelTwoQTR50Cost.jpeg)

3. Slot Model: Cost 25

![Crank Model](https://github.com/07priyayadav/cmpe202/blob/master/lab10/output/SlotModelCost25.jpeg)

4. Slot Model: Cost 50

![Crank Model](https://github.com/07priyayadav/cmpe202/blob/master/lab10/output/SlotModelCost50.jpeg)
