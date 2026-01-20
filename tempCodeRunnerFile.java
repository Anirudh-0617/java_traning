interface ParkingOperation {
    void execute(int count);
}

class ParkingStatus {
    private int totalSlots;
    private int occupiedSlots;

    ParkingStatus(int totalSlots) {
        this.totalSlots = totalSlots;
        this.occupiedSlots = 0;
    }

    int getAvailableSlots() {
        return totalSlots - occupiedSlots;
    }

    void updateOccupiedSlots(int count) {
        occupiedSlots += count;
    }

    void releaseSlots(int count) {
        occupiedSlots -= count;
        if (occupiedSlots < 0) {
            occupiedSlots = 0;
        }
    }
}

class AllocateSlot implements ParkingOperation {
    private ParkingStatus status;

    AllocateSlot(ParkingStatus status) {
        this.status = status;
    }

    public void execute(int count) {
        if (status.getAvailableSlots() >= count) {
            status.updateOccupiedSlots(count);
            System.out.println("Allocated " + count + " slot(s).");
        } else {
            System.out.println("Allocation failed. Available slots: "
                    + status.getAvailableSlots());
        }
    }
}

class ReleaseSlot implements ParkingOperation {
    private ParkingStatus status;

    ReleaseSlot(ParkingStatus status) {
        this.status = status;
    }

    public void execute(int count) {
        status.releaseSlots(count);
        System.out.println("Released " + count + " slot(s).");
    }
}

class ReserveSlot implements ParkingOperation {
    private ParkingStatus status;

    ReserveSlot(ParkingStatus status) {
        this.status = status;
    }

    public void execute(int count) {
        if (status.getAvailableSlots() >= count) {
            status.updateOccupiedSlots(count);
            System.out.println("Reserved " + count + " slot(s).");
        } else {
            System.out.println("Reservation failed. Not enough slots.");
        }
    }
}

class ParkingController {
    private ParkingOperation operation;

    void setOperation(ParkingOperation operation) {
        this.operation = operation;
    }

    void process(int count) {
        operation.execute(count);
    }
}

public class Main {
    public static void main(String[] args) {

        ParkingStatus status = new ParkingStatus(50);
        ParkingController controller = new ParkingController();

        System.out.println("Initial available slots: "
                + status.getAvailableSlots());

        controller.setOperation(new AllocateSlot(status));
        controller.process(15);
        System.out.println("Available slots after allocation: "
                + status.getAvailableSlots());

        controller.setOperation(new ReserveSlot(status));
        controller.process(10);
        System.out.println("Available slots after reservation: "
                + status.getAvailableSlots());

        controller.setOperation(new ReleaseSlot(status));
        controller.process(5);
        System.out.println("Available slots after release: "
                + status.getAvailableSlots());
    }
}