package sample

class Cell {
    fun evolve(numberOfNeighbours: Int): State {
        if (numberOfNeighbours < 2 || numberOfNeighbours > 3) {
            return State.DIE
        }

        if (numberOfNeighbours == 3) {
            return State.REPRODUCE
        }
        return State.LIVE
    }
}

enum class State {
    DIE, LIVE, REPRODUCE
}