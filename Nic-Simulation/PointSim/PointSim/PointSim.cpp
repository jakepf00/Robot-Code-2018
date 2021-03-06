#include "stdafx.h" //remove when not running in VS or without file
#include <iostream>

//red for 0, blue for 1

int blocksOnBlue = 0;
int blocksOnRed = 0;
int blocksOnBlueBal = 0;
int blocksOnRedBal = 0;
int bluePoint = 0;
int redPoint = 0;

int scoreSwitch(int color, int blocks, int seconds) {

	//function should return the value of points for seconds scored
	//however, it will retain the amount of blocks placed on each switch
	//only the local switch is calculated, as the far is planned to be infeasible
	//assumes one block is able to control the switch

	int score = 0;

	if (color == 0) {
		score = 0;
		blocksOnRed += blocks;
		if (blocksOnRed == blocksOnBlue) {
			seconds = 0;
		}
		score += seconds;
	}

	if (color == 1) {
		score = 0;
		blocksOnBlue += blocks;
		if (blocksOnBlue == blocksOnRed) {
			seconds = 0;
		}
		score = 0;
		score += seconds;
	}
	return score;
}

int scoreBalance(int color, int blocks, int seconds) {

	//practically the same thing as scoreSwitch, but with balance

	int score = 0;

	if (color == 0) {
		score = 0;
		blocksOnRedBal += blocks;
		if (blocksOnRedBal == blocksOnBlueBal) {
			seconds = 0;
		}
		score += seconds;
	}

	if (color == 1) {
		score = 0;
		blocksOnBlueBal += blocks;
		if (blocksOnBlueBal == blocksOnRedBal) {
			seconds = 0;
		}
		score = 0;
		score += seconds;
	}
	return score;
}

int botsClimbedRed = 0;
int botsClimbedBlue = 0;

int LevitateSlotRed = 0;
int BoostSlotRed = 0;
int ForceSlotRed = 0;
int LevitateSlotBlue = 0;
int BoostSlotBlue = 0;
int ForceSlotBlue = 0;

int scoreVault(int color, int blocks, int powerUp) {
	//powerUp 1 = levitate, 2 = boost, 3 = force

	//get blocks in their slots for red and blue

	if (color == 0) {
		if (powerUp == 1) {
			LevitateSlotRed += blocks;
		}
		if (powerUp == 2) {
			BoostSlotRed += blocks;
		}
		if (powerUp == 3) {
			ForceSlotRed += blocks;
		}
	}

	else {
		if (powerUp == 1) {
			LevitateSlotBlue += blocks;
		}
		if (powerUp == 2) {
			BoostSlotBlue += blocks;
		}
		if (powerUp == 3) {
			ForceSlotBlue += blocks;
		}
	}

	
	if (color == 0) {

		if (powerUp == 1) { //powerup one is levitate
			if (LevitateSlotRed >= 3) {
				redPoint += 30;
				++botsClimbedRed;
			}
			else {
				std::cout << "Not enough blocks to score" << std::endl;
			}
			
		}

		if (powerUp == 2) { //powerup two is boost

		}
	}
	
	if (color == 1) {
		if (powerUp == 1) {
			bluePoint += 30;
			++botsClimbedBlue;
		}
	}
}

int main() {



	bool redTeamDone = false;
	bool blueTeamDone = false;
	
	

	int scoringRed = scoreSwitch(0, 2, 10);
	int scoringBlue = scoreSwitch(1, 2, 10);
	std::cout << "The return for Red's value is " << scoringRed << ", and Blue returned " << scoringBlue << std::endl;
}