# GetEdge
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?

## Approach & Efficiency
### travelPossible() Method
- Takes in an array of nodes that represents each location
- Walk the given array. For each location: 
  - Check if the next location in the desired path is a neighbor
  - TRUE: add the cost to the total
  - FALSE: return false
- At the end return true and the total cost as a string 

### Whiteboard image: 

![Image]()