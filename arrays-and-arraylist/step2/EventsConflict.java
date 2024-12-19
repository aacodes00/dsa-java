package step2;

public class EventsConflict {
    public static void main(String[] args) {
        String[] event1 = {"01:37","14:20"};
        String[] event2 = {"05:06","06:17"};

        boolean conflict;

        String start1 = event1[0];
        String end1 = event1[1];

        String start2 = event2[0];
        String end2 = event2[1];

        // Check for conflict (overlap or touch)
        if (start1.compareTo(end2) <= 0 && start2.compareTo(end1) <= 0) {
            conflict = true; // Conflict (events overlap or touch) 
        } else {
            conflict = false; // No conflict (either event starts after the other ends)
        }
 
        System.out.println(conflict);
        
    }
    
    
}


// Condition for Conflict:
// Both conditions must be true for a conflict (overlap or touch) to occur:
// start1.compareTo(end2) <= 0 ensures that Event 1 starts before or when Event 2 ends.
// start2.compareTo(end1) <= 0 ensures that Event 2 starts before or when Event 1 ends.
// This means that if Event 1 starts before Event 2 ends and Event 2 starts before Event 1 ends, the events either overlap or touch.

// Condition for No Conflict:
// If either condition fails, it means one event ends before the other starts. In this case, there's no overlap or touching.