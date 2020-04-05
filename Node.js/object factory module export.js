module.exports = function () {
    return {
        sponser: 'Greater Kashmir private limitted (default)',
        shortAdvertisement: 2000,
        mediumAdvertisement: 4000,
        longAdvertisement: 10000,
        putDetails: function () {
            console.log('Sponser -> ' + this.sponser);
            console.log('short -> ' + this.shortAdvertisement);
            console.log('medium -> ' + this.mediumAdvertisement);
            console.log('long -> ' + this.longAdvertisement);
            console.log('overall cost of all the three', this.shortAdvertisement + this.mediumAdvertisement + this.longAdvertisement);
        }
    };
};